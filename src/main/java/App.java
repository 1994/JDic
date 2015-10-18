import core.BaiduAPI;
import core.Sen.BaiduSen;
import core.Dic.BaiduDic;
import core.Dic.BaiduSymbol;
import util.WordUtil;

import java.util.List;

public class App {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < args.length; i++) {
            if(!WordUtil.isAvailable(args[i]))
                continue;

            if (args[i].equals("-s")) {
                index = i;
                flag=true;
                break;
            }
            BaiduDic baiduDic = null;
            baiduDic = BaiduAPI.query(args[i]);
            if(baiduDic==null) {
                continue;
            }
            System.out.print(ANSI_BOLD);
            System.out.print(ANSI_YELLOW+baiduDic.getData().getWord_name()+ANSI_RESET);
            System.out.print("\t");
            String phen = baiduDic.getData().getSymbols().get(0).getPh_en();
            String pham = baiduDic.getData().getSymbols().get(0).getPh_am();
            if(WordUtil.isAvailable(phen))
                System.out.print("[英][" + ANSI_RED+phen+ANSI_RESET + "]");
            System.out.print("\t");
            if(WordUtil.isAvailable(pham))
                System.out.println("[美][" +ANSI_RED+ pham +ANSI_RESET+ "]");
            List<BaiduSymbol.Part> parts = baiduDic.getData().getSymbols().get(0).getParts();
            for (BaiduSymbol.Part p : parts) {
                System.out.print(" · " + p.getPart());
                System.out.print("\t");
                System.out.println(p.getMeans());
            }

            if (args.length > 1)
                System.out.println();
        }
        if (flag) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = index + 1; i < args.length; i++) {
                stringBuilder.append(args[i]);
                if(i!=args.length-1)
                    stringBuilder.append(" ");
            }
            BaiduSen baiduSen = null;
            baiduSen = BaiduAPI.queryS(stringBuilder.toString());
            if(baiduSen==null)
                return;
            System.out.println("原句:"+baiduSen.getTrans_result().get(0).getSrc());
            System.out.println("译文:" + baiduSen.getTrans_result().get(0).getDst());
        }
    }
}
