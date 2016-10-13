package template.seven.com;

/**
 * Created by lj on 16/10/13.
 */
public class Robot {



    public Robot() {

    }

    public void go() {

        start();

        getParts();

        assemble();

        test();

        stop();

    }

    public void start() {

        System.out.println("Starting...");

    }

    public void getParts() {

        System.out.println("Getting  a carburetor...");

    }

    public void assemble() {

        System.out.println("Installing the carburetor...");

    }

    public void test() {

        System.out.println("Reving the engine...");

    }

    public void stop() {

        System.out.println("Stopping...");

    }

}