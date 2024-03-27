package Shaigaliev.cryptoanalyzer;

import Shaigaliev.cryptoanalyzer.entity.Result;

public class ConsoleRunner {
    public static void main(String[] args) {

        Application application = new Application();
        Result result=application.run(args);
        System.out.println(result);
    }
}


//int key=123
//String text="Привет"
//String result=".................."