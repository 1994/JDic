package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by reeco_000 on 2015/10/18.
 */
public class WordUtil {

    public static boolean isChineseChar(String word){
        boolean temp = false;
        Pattern p=Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m=p.matcher(word);
        if(m.find())
            temp =  true;
        return temp;
    }

    public static boolean isAvailable(String word) {
        boolean temp = true;
        if(word==null||word.equals(""))
            temp = false;
        return temp;
    }

}
