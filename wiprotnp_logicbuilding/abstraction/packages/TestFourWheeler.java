import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class TestFourWheeler {

    public static void main(String[] args) {

        Logan l = new Logan();

        System.out.println("-----Logan-----");
        System.out.println("Model : " + l.getModelName());
        System.out.println("Registration : " + l.getRegistrationNumber());
        System.out.println("Owner : " + l.getOwnerName());
        System.out.println("Speed : " + l.speed());
        System.out.println("GPS : " + l.gps());

        System.out.println();

        Ford f = new Ford();

        System.out.println("-----Ford-----");
        System.out.println("Model : " + f.getModelName());
        System.out.println("Registration : " + f.getRegistrationNumber());
        System.out.println("Owner : " + f.getOwnerName());
        System.out.println("Speed : " + f.speed());
        System.out.println("Temperature : " + f.tempControl());
    }
}