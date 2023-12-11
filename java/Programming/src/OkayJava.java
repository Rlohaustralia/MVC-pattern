import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OkayJava {
    public static void main(String[] args) {

        String tenentID = "SeongDong APT 1301";

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




    }
}
