package decorator.three.chapter.com;

/**
 * Created by lj on 16/10/9.
 */
public class Monitor extends ComponentDecorator {
    Computer computer;

    public Monitor(Computer c) {
        computer = c;
    }

    public String description() {
        return computer.description() + " add a monitor";
    }
}
