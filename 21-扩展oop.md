## 扩展OOP

设计模式圣经《Design Patterns: Elements of Reusable Object-Oreiented Software》的题目中包含了设计模式的两个重要属性，一个是reuse，即重复性；另一个就是OOP，设计模式产生的背景就是协助OOP解决问题的。



OOP(面向对象编程)诞生的背景是程序越来越复杂，通过引入对象来对程序各部分进行抽象继而实现了对程序的分割。本质上属于分治(divide-conquer)的思想。

OOP有四大属性：抽象(abstraction)、封装(encapsulation)、多态(polymorphism)和继承(inheritance)。



抽象并不是一种具体的编程技巧，它应用在分析问题的过程中，一个好的程序员必须要具有对问题进行抽象的能力，这样才能达到事半功倍。啥是抽象？抽象就是你在脑中对问题进行分割，思考用OOP如何去解决的过程。


只有做到心中有数，才能码代码如有神。


抽象工作完成后，下一步就要对对象进行封装了，这个对象要包含哪些方法？包含哪些数据？public还是private？怎么设计对外接口？说白了，脏活累活都要在封装完成，对于使用者来说，他只看到了对象的接口，而对象内部复杂的逻辑则完全隐藏。


设计模式在封装阶段发挥了重要作用，**一个最基本的设计思路是将变化最多或者最需要维护的那部分进行封装**。比如中介者(Mediator)模式将页面跳转部分进行封装。




OOP的另两个基石是多态和继承，不过对于设计模式来说，它更偏爱组合(composition)而不是继承。继承是一种“is-a”关系，比如正方形是一个长方形。而组合是一种“has-a”关系，比如汽车类中包含轮子对象、方向盘对象。由于“has-a”关系的存在，一个对象会包含多个不同类型的对象，我们又期望尽可能的用相同的代码来操作不同的对象，所以多态在设计模式中占有重要地位。




可能你有疑问了，为啥要用组合而不是继承呢？看一个具体的例子吧，你所在的公司接到了一个单子，和宝驴汽车公司合作设计车型，CTO说这好办，就用继承解决，先创建一个汽车基类：

```
public abstract class Vehicle { 
    public Vehicle() { 
    } 
    public void go() { 
        System.out.println("Now I'm driving."); 
    }
}

```

然后想要啥车型，说吧，甲方说先来一个街车赛车，CTO说这好办，

```
public class StreetRacer extends Vehicle {
    public StreetRacer() { 
    }
}

public class Run { 
    public static void main(String[] args) { 
        StreetRacer streetRacer = new StreetRacer();      
        streetRacer.go(); 
    }
}

程序输出：

Now I'm driving.

```

甲方说再来一个F1赛车呢？CTO说这也好办，

```
public class FormulaOne extends Vehicle { 
    public FormulaOne() { 
    }
}


public class Run { 
    public static void main(String[] args) { 
        StreetRacer streetRacer = new StreetRacer();
        FormulaOne formulaOne = new FormulaOne(); 
        
        streetRacer.go(); 
        formulaOne.go(); 
    }
}

输出：
Now I'm driving.
Now I'm driving.

```

CTO很开心，继承就是好用啊。过几天甲方又说，能造直升飞机吗？CTO一拍脑袋，好办啊，

```
public class Helicopter extends Vehicle { 
    public Helicopter() { 
    }
}

public class Run { 
    public static void main(String[] args) { 
        StreetRacer streetRacer = new StreetRacer(); 
        FormulaOne formulaOne = new FormulaOne();
        Helicopter helicopter = new Helicopter(); 
        
        streetRacer.go(); 
        formulaOne.go(); 
        helicopter.go(); 
    }
}

输出：

Now I'm driving.
Now I'm driving.
Now I'm driving.


```

咦，好像哪里不对，直升机不会开啊，它可是会飞的呀。没想到过了两天，甲方又说我们还想造喷气式飞机，如果还继承Vehicle，

```
public class Jet extends Vehicle { 
    public Jet() { 
    }
}

public class Run { 
    public static void main(String[] args) { 

        StreetRacer streetRacer = new StreetRacer();
        FormulaOne formulaOne = new FormulaOne();
        Helicopter helicopter = new Helicopter(); 
        Jet jet = new Jet(); 

        streetRacer.go(); 
        formulaOne.go(); 
        helicopter.go(); 
        jet.go(); }}

输出：
Now I'm driving.
Now I'm driving.
Now I'm driving.
Now I'm driving.


```

情况越来越糟糕了，CTO说这好办，修改Helicopter的go方法就好了，

```
public class Helicopter extends Vehicle {
    public Helicoper(){
        
    }
    @Override
    public void go() {
        System.out.println("Now I'm flying.");
    }
}

```

或者创建一个接口，这个接口包含一个go方法，每个类都必须实现自己的go方法。

```
public class Helicoper implements IFly {
    public Helicoper(){
    }

    public void go() {
        System.out.println("Now I'm flying.");
    }

}

```
你想，如果车型很多，这样做代码就得不到重用了，这个方法也不好。




























