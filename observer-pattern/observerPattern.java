public class observerPattern {
    public static void main(String[] args) {
        WeatherData weatherdata=new WeatherData();
        CurrentConditionDisplay ccDisplay=new CurrentConditionDisplay(weatherdata);
        weatherdata.setMeasurements(80, 55, 3);
    }
}
