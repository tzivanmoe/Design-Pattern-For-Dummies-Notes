package chain.four.com;

/**
 * Created by lj on 16/10/11.
 */
public class FrontEnd implements HelpInterface {

    HelpInterface successor; //后一个对象

    final int FRONT_END_HELP = 1;

    public FrontEnd(HelpInterface s) {

        successor = s;

    }

    public void getHelp(int helpConstant) {

        if (helpConstant != FRONT_END_HELP) {

            successor.getHelp(helpConstant);

        } else {

            System.out.println("This is the front end. Don't you like it?");

        }

    }

}