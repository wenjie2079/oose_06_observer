public class ThinWheel extends Behaviour{
    public ThinWheel(){
        distanceForWeather.put(WeatherType.DRY, +2);
        distanceForWeather.put(WeatherType.MISTY, 0);
        distanceForWeather.put(WeatherType.WET, -2);
    }

//    public int distanceTraveledInWeather(WeatherType weatherType) {
//        return distanceForWeather.getOrDefault(weatherType, distanceDefault);
//    }
}
