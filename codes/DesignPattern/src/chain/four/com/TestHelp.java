package chain.four.com;

/**
 * Created by lj on 16/10/11.
 */


public class TestHelp {

    public static void main(String[] args) {

        final int FRONT_END_HELP = 1;

        final int INTERMEDIATE_LAYER_HELP = 2;

        final int GENERAL_HELP = 3;



        Application app = new Application();

        IntermediateLayer intermediateLayer = new IntermediateLayer(app);

        FrontEnd frontEnd = new FrontEnd(intermediateLayer);

        frontEnd.getHelp(GENERAL_HELP);

    }

}


