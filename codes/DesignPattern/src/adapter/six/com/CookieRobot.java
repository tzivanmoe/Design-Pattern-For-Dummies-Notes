package adapter.six.com;

/**
 * Created by lj on 16/10/13.
 */
public class CookieRobot extends RobotTemplate {

    private String name;



    public CookieRobot(String n) {

        name = n;

    }

    public void getParts() {

        System.out.println("Getting flour and sugar...");

    }

    public void assemble() {

        System.out.println("Baking a cookie...");

    }

    public void test() {

        System.out.println("Crunching a cookie...");

    }

    public String getName() {

        return name;

    }

}
