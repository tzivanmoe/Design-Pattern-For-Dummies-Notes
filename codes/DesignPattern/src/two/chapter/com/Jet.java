package two.chapter.com;

/**
 * Created by lj on 16/10/9.
 */
public class Jet extends Vehicle{

    public Jet(){

        setGoAlgorithm(new GoByFlyingFastAlgorithm());

    }

}