package core.Dic;

import java.util.ArrayList;

/**
 * Created by reeco_000 on 2015/10/17.
 */
public class BaiduData {

    private String word_name;

    private ArrayList<BaiduSymbol> symbols;

    public String getWord_name() {
        return word_name;
    }

    public void setWord_name(String word_name) {
        this.word_name = word_name;
    }

    public ArrayList<BaiduSymbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(ArrayList<BaiduSymbol> symbols) {
        this.symbols = symbols;
    }
}
