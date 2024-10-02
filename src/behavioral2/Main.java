package behavioral2;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        HumidityDisplay humidityDisplay = new HumidityDisplay();
        
        weatherData.registerObserver(tempDisplay);
        weatherData.registerObserver(humidityDisplay);
        
        weatherData.setMeasurements(30.5f, 65.0f);
        weatherData.setMeasurements(25.0f, 70.0f);
    }
}