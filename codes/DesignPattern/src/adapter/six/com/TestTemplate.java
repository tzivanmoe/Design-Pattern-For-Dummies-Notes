package adapter.six.com;

/**
 * Created by lj on 16/10/13.
 */
public class TestTemplate {

    public static void main(String[] args) {

        AutomotiveRobot automotiveRobot = new AutomotiveRobot("Automotive Robot");

        CookieRobot cookieRobot = new CookieRobot("Cookie Robot");

        System.out.println(automotiveRobot.getName() + ":");

        automotiveRobot.go();

        System.out.println();

        System.out.println(cookieRobot.getName() + ":");

        cookieRobot.go();

    }

}


