package tradingStrat;
import java.util.*;
public class Strategy {
    private Object[] data;
    private int chlen;
    private double stopPct;
    private Map<String, Object> dic;
    private double prevPeak;

    public Strategy(Object[] data, int chlen, double stopPct ){
        this.data = data;
        this.chlen = chlen;
        this.stopPct = stopPct;
        this.dic = new Hashtable<>();
//        this.dic.put("Date1", 0);
//        this.dic.put("Time1", 0);
//        this.dic.put("Price1", 0);
//        this.dic.put("Action1", 0);
//        this.dic.put("Date2", 0);
//        this.dic.put("Time2", 0);
//        this.dic.put("Price2", 0);
//        this.dic.put("Action2", 0);


    }
    public void dicAction1(Date date, Date time, double price, String action){
        this.dic.put("Date1", date);
        this.dic.put("Time1", time);
        this.dic.put("Price1", price);
        this.dic.put("Action1", action);
    }
    public void dicAction2(Date date, Date time, double price, String action){
        this.dic.put("Date2", date);
        this.dic.put("Time2", time);
        this.dic.put("Price2", price);
        this.dic.put("Action2", action);
    }
    public void enterTrade(Date date, Date time, double price, String action) {
        dicAction1(date, time, price, action);

    }
}
