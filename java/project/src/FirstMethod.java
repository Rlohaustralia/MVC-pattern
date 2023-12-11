import java.io.FileWriter;
import java.io.IOException;

public class FirstMethod {

    public static void main(String[] args) throws IOException {
        FileWriter email = new FileWriter("email.txt");
        email.write(greetingEmail("Eojin", "Thank you for visiting us"));
        email.close();
    }

    public static String greetingEmail (String name, String message){
        String emailContent = "";
        emailContent = "Hello " + name + "\n" + message;
        return emailContent;

    }
}
