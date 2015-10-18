package core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import core.Dic.BaiduDic;
import core.Sen.BaiduSen;
import jodd.http.HttpException;
import jodd.http.HttpRequest;
import jodd.http.HttpResponse;
import jodd.util.StringPool;
import util.WordUtil;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by reeco_000 on 2015/10/17.
 */
public class BaiduAPI {

    private static final String BAIDUAPI = "NToYfrTzdT3VBp5FspM4Cvxp";
    private static final String DIC = "http://openapi.baidu.com/public/2.0/translate/dict/simple";
    private static final String TRANSLATE = "http://openapi.baidu.com/public/2.0/bmt/translate";

    private static Map<String, String> queryParam = new HashMap<String, String>();

    public static BaiduDic query(String word) {
        if (!queryParam.isEmpty())
            queryParam.clear();
        queryParam.put("client_id", BAIDUAPI);
        queryParam.put("q", word);
        if(!WordUtil.isChineseChar(word)){
            queryParam.put("from", "en");
            queryParam.put("to", "zh");
        } else {
            queryParam.put("from", "zh");
            queryParam.put("to", "en");
        }

        try {
            HttpResponse httpResponse = HttpRequest.get(DIC).queryEncoding(StringPool.UTF_8)
                    .query(queryParam)
                    .send();
//            System.out.println(httpResponse.body());
            return JSON.parseObject(httpResponse.body(), BaiduDic.class);
        }catch (JSONException e){
            System.out.println("查询不到此单词: 「"+word+"」 请检查拼写!");
        }catch (HttpException e){
            System.out.println("请检查网络");
        }catch (Exception e){
            System.out.println("未知错误");
        }
        return null;

    }

    public static BaiduSen queryS(String s) {
        if (!queryParam.isEmpty())
            queryParam.clear();
        queryParam.put("client_id", BAIDUAPI);
        queryParam.put("q", s);
        queryParam.put("from", "auto");
        queryParam.put("to", "auto");
        try {
            HttpResponse httpResponse = HttpRequest.get(TRANSLATE).queryEncoding(StringPool.UTF_8)
                    .query(queryParam)
                    .send();

            return JSON.parseObject(httpResponse.body(), BaiduSen.class);

        } catch (HttpException e) {
            System.out.println("请检查网络");
        } catch (Exception e){
            System.out.println("位置错误");
        }
        return null;
    }
}
