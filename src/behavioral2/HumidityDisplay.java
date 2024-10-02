package behavioral2;

public class HumidityDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Humidity: " + humidity);
    }
}