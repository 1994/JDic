package core.Dic;

/**
 * Created by reeco_000 on 2015/10/17.
 */
public class BaiduDic {

    private int errno;

    private String to;

    private String from;

    private BaiduData data;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public BaiduData getData() {
        return data;
    }

    public void setData(BaiduData data) {
        this.data = data;
    }
}
