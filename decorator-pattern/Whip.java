public class Whip extends CondimentDecorator {
    Beverage b;

    public Whip(Beverage b){
        this.b=b;
    }

    public String getDesc() {
        return b.getDesc()+" with Whip Cream";
    }


    public double cost() {
        return 0.19 +b.cost();
    }
    
}
