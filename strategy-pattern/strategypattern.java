public class strategypattern{
    public static void main(String[] args) {
        Duck mallarDuck=new MallardDuck();
        mallarDuck.performflyk();
        mallarDuck.setflybehaviour(new flyNoWay());
        mallarDuck.performflyk();
        mallarDuck.performquack();

    }
}