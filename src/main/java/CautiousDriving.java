public class CautiousDriving extends Behaviour{
    public CautiousDriving(){
        distanceForWeather.put(WeatherType.DRY, 20);
        distanceForWeather.put(WeatherType.MISTY, 10);
        distanceForWeather.put(WeatherType.WET, 10);
    }
}
