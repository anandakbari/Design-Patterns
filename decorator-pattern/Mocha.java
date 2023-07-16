public class Mocha extends CondimentDecorator{
    Beverage b;

    public Mocha(Beverage b){
        this.b=b;
    }


    public String getDesc() {
        return b.getDesc()+ " with Mocha";
    }


    public double cost() {
        return 0.20+b.cost();
    }

}
