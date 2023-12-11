import javax.swing.*;

public class Result {

    public static String possible = "possible";
    public String notPossible = "notPossible";


    public static void main(String[] args) {

        Test test1 = new Test();
        test1.message = "Congratulation!";

        Test test2 = new Test();
        test2.message = "I'm sorry!";

        test1.Pass();
        test2.Fail();

    }

    public void instance(){
        System.out.println(notPossible);
    }

}

class Check {
    public static void main(String[] args) {
        System.out.println(Result.possible);
        Test t1 = new Test();

    }
}
