import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
    public static void main(String[] args) throws IOException {
        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));

        FileWriter introFile = new FileWriter ("data.txt");
        introFile.write("Hello ");
        introFile.write(" Eojin!");
        introFile.close();


        FileWriter bodyFile = new FileWriter ("data2.txt");
        bodyFile.write("How are you going? ");
        bodyFile.write(" I'm good!");
        bodyFile.close();



    }

}
