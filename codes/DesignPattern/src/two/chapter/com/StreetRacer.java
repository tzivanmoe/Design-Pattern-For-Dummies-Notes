package two.chapter.com;

/**
 * Created by lj on 16/10/9.
 */
public class StreetRacer extends Vehicle{

    public StreetRacer(){

        setGoAlgorithm(new GoByDrivingAlgorithm());

    }

}