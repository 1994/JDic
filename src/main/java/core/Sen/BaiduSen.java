package core.Sen;

import java.util.ArrayList;

/**
 * Created by reeco_000 on 2015/10/18.
 */
public class BaiduSen {
    private String from;
    private String to;
    private ArrayList<BaiduTrans> trans_result;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public ArrayList<BaiduTrans> getTrans_result() {
        return trans_result;
    }

    public void setTrans_result(ArrayList<BaiduTrans> trans_result) {
        this.trans_result = trans_result;
    }
}
