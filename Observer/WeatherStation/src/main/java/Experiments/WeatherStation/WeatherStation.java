package Experiments.WeatherStation;

public class WeatherStation {

	public void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay cd = new currentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
