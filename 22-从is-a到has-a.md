## 从“is-a”到“has-a”

相对于严格的继承关系，组合就显得灵活多了，特别是对于经常变换的部分，用组合实现要好太多，因为继承属于硬编码，直接将变化部分编码到基类，每一个子类都会得到相同的继承。

上一节的例子中，经常变换的部分就是go方法，我们需要把它独立出来。对于汽车和飞机来说，go的实现是不同的，而每一种对go的实现又被称为一种算法(algorithm)。每一个算法针对一类具体的对象/任务。


为了让所有的算法都实现相同的方法，我们需要创建一个接口来保护此方法，

```
public interface GoAlgorithm {
    public void go();
}
```

然后我们需要实现不同的算法，每一个算法都针对一类车型，
```
public class GoByDrivingAlgorithm implements GoAlgorithm {
    public void go() {
        System.out.println("Now I'm driving.");
    }
}

public class GoByFlyingAlgorithm implements GoAlgorithm {
    public void go() {
        System.out.println("Now I'm flying.");
    }
}

public class GoByFlyingFastAlgorithm implements GoAlgorithm {
    public void go() {
        System.out.println("Now I'm flying fast.");
    }
}

```

有了上面的算法，我们就可以结合“has-a”来实现各个车型了。还是来创建一个基类，

```
public abstract class Vehicle{
    private GoAlgorithm goAlgorithm;

    public Vehicle(){
    }

    public void setGoAlgorithm(GoAlgorithm algorithm){
        goAlgorithm = algorithm;
    }

    public void go(){
        goAlgorithm.go();
    }

}
```

为了实现各个具体的车型，在继承基类时，我们只需要设置具体的算法即可，

```
public class StreetRacer extends Vehicle{
    public StreetRacer(){
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}

public class FormulaOne extends Vehicle{
    public FormulaOne(){
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}

public class Helicopter extends Vehicle{
    public Helicopter(){
        setGoAlgorithm(new GoByFlyingAlgorithm());
    }
}

public class Jet extends Vehicle{
    public Jet(){
        setGoAlgorithm(new GoByFlyingFastAlgorithm());
    }
}

```

测试一下吧，

```
public class StartTheRace { 
    public static void main(String[] args){ 
        
        StreetRacer streetRacer = new StreetRacer();
        FormulaOne formulaOne = new FormulaOne();
        Helicopter helicopter = new Helicopter(); 
        Jet jet = new Jet(); 

        streetRacer.go(); 
        formulaOne.go(); 
        helicopter.go(); 
        jet.go(); 
    }
}

输出：
Now I'm driving.
Now I'm driving.
Now I'm flying.
Now I'm flying fast.

```




