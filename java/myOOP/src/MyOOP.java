import java.util.Scanner;
public class MyOOP {
//    public static void main(String[] args) {
//        delimiter = "-----";
//        importantCodeA();
//
//        delimiter = "******";
//        importantCodeB();
//    }
//
//    public static String delimiter = "";
//    public static void importantCodeA() {
//        System.out.println(delimiter);
//        System.out.println("Important code A");
//        System.out.println("Important code A");
//        System.out.println("Important code A");
//    }
//
//    public static void importantCodeB() {
//        System.out.println(delimiter);
//        System.out.println("Important code B");
//        System.out.println("Important code B");
//        System.out.println("Important code B");
//    }

    public static String userGender;
    public static String userName;
    public static String userAge;
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter your gender: ");
        userGender = userInput.nextLine();  // Read user input

        System.out.println("Enter your name: ");
        userName = userInput.nextLine();  // Read user input

        System.out.println("Enter your age: ");
        userAge = userInput.nextLine();  // Read user input

        if (userGender.equals("Male")) {
            personalDetailsMale();
        } else {
            personalDetailsFemale();
        }
    }


    public static void personalDetailsMale() {
        System.out.println("You are: " + userGender);
        System.out.println("Your name is: " + userName);
        System.out.println("Your age is: " + userAge);
        System.out.println("You're handsome");
        System.out.println("-----------------------");
    }
    public static void personalDetailsFemale() {
        System.out.println("You are: " + userGender);
        System.out.println("Your name is: " + userName);
        System.out.println("Your age is: " + userAge);
        System.out.println("You're pretty");
        System.out.println("-----------------------");
    }

}


