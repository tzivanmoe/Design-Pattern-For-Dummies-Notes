package adapter.six.com;

/**
 * Created by lj on 16/10/13.
 */
public abstract class RobotTemplate {

    public final void go() { //禁止重写

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

        System.out.println("Getting parts...");

    }

    public void assemble() {

        System.out.println("Assembling...");

    }

    public void test() {

        System.out.println("Testing...");

    }

    public void stop() {

        System.out.println("Stopping...");

    }

}