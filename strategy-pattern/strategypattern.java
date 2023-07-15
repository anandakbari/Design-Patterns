import java.util.*;


interface quackBehaviour{
    public void quack();
}

interface flyBehaviour{
    public void fly();
}

class flyWithWings implements flyBehaviour{
    public void fly(){
        System.out.println("i fly with wings");
    }
}

class flyNoWay implements flyBehaviour{
    public void fly(){
        System.out.println("i do not fly");
    }
}

class quackk implements quackBehaviour{
    public void quack(){
        System.out.println("quack");
    }
}

class squeak implements quackBehaviour{
    public void quack(){
        System.out.println("squeak");
    }
}

class muteQuack implements quackBehaviour{
    public void quack(){
        System.out.println("silence");
    }
}



public class strategypattern{
    public static void main(String[] args) {
        Duck mallarDuck=new MallardDuck();
        mallarDuck.performflyk();
        mallarDuck.setflybehaviour(new flyNoWay());
        mallarDuck.performflyk();
        mallarDuck.performquack();

    }
}