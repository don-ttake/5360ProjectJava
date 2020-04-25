package tradingStrat;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        String ascPath =  "C:\\Users\\lmc97\\IdeaProjects\\5360Project\\src\\tradingStrat\\BO-5min.asc";
        tradingStrat.DataRetriver dataRetriver = new tradingStrat.DataRetriver(ascPath);


    }

}
