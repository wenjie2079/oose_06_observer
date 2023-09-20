import java.util.ArrayList;
import java.util.List;

public class RaceWeather implements Subject {
	private WeatherType weatherType;
	private List<Observer> observers = new ArrayList<>();

	public RaceWeather(WeatherType weatherType) {
		this.weatherType = weatherType;
	}


	// For observers to pull the weather when notified or at creation
	public WeatherType getWeatherType() {
		return weatherType;
	}

	// Notify that there are changes to pull


	public void changeWeather() {
		weatherType = weatherType.next();
	}


	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver(Observer observer) {
		for (int i = 0; i < observers.size(); i++) {
			observer = observers.get(i);
			observer.update(weatherType);
		}
	}
}