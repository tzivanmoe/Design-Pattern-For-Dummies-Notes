package adapter.six.com;

/**
 * Created by lj on 16/10/13.
 */

public class AutomotiveRobot extends RobotTemplate {

    String name;

    public AutomotiveRobot(String n) {

        name = n;

    }



    public void getParts() {

        System.out.println("Getting a carburetor...");

    }



    public void asssemble() {

        System.out.println("Installing the carburetor...");

    }

    public void test() {

        System.out.println("Revving the engine...");

    }

    public String getName() {

        return name;

    }

}

