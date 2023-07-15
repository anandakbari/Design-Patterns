public class MallardDuck extends Duck{
    public MallardDuck(){
        qb=new quackk();
        fb=new flyWithWings();
    }

    @Override
    public void display() {
        System.out.println("i m mallard");
    }
}
