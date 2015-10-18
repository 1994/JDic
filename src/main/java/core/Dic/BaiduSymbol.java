package core.Dic;

import java.util.ArrayList;

/**
 * Created by reeco_000 on 2015/10/17.
 */
public class BaiduSymbol {

    private String ph_am;

    private String ph_en;

    private ArrayList<Part> parts;

    public String getPh_am() {
        return ph_am;
    }

    public void setPh_am(String ph_am) {
        this.ph_am = ph_am;
    }

    public String getPh_en() {
        return ph_en;
    }

    public void setPh_en(String ph_en) {
        this.ph_en = ph_en;
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public void setParts(ArrayList<Part> parts) {
        this.parts = parts;
    }

    public class Part{
        private String part;
        private ArrayList<String> means;

        public String getPart() {
            return part;
        }

        public void setPart(String part) {
            this.part = part;
        }

        public ArrayList<String> getMeans() {
            return means;
        }

        public void setMeans(ArrayList<String> means) {
            this.means = means;
        }
    }
}
