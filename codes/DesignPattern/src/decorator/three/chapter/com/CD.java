package decorator.three.chapter.com;


public class CD extends ComponentDecorator {

    Computer computer;

    public CD(Computer c) {
        computer = c;
    }

    public String description() {
        return computer.description() + " add a CD";
    }
}


