package two.chapter.com;

/**
 * Created by lj on 16/10/9.
 */
public class Helicopter extends Vehicle{

    public Helicopter(){

        setGoAlgorithm(new GoByFlyingAlgorithm());

    }

}
