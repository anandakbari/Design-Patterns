public class decorator {
    public static void main(String[] args) {
        Beverage espresso=new Espresso();
        System.out.println(espresso.getDesc()+ " $"+ espresso.cost());

        Beverage houseblend=new HouseBlend();
        houseblend=new Mocha(houseblend);
        houseblend=new Whip(houseblend);
        System.out.println(houseblend.getDesc()+ " $"+ houseblend.cost());
    }
}
