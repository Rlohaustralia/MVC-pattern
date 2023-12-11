import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
import javax.swing.*;

public class OkayJavaInput {
    public static void main(String[] args) {

        String tenentID = JOptionPane.showInputDialog("Enter your ID: ");
        String brightness = JOptionPane.showInputDialog("Enter a brightness: ");

        // Elevator call
        Elevator myElevator = new Elevator(tenentID);
        myElevator.callForUp(1);

        // Security off
        Security mySecurity = new Security(tenentID);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(tenentID + "Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(tenentID + "Floor Lamp");
        floorLamp.on();

        DimmingLights moodLight = new DimmingLights(tenentID + "Mood Lamp");
        moodLight.setBright(Double.parseDouble(brightness));
        moodLight.on();



    }
}
