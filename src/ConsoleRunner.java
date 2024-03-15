import entity.Result;

public class ConsoleRunner {
    public static void main(String[] args) {

        Application application = new Application(args);
        Result result=application.run();
        System.out.println(result);
    }
}


//int key=123
//String text="Привет"
//String result=".................."