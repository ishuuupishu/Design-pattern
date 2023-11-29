import java.util.ArrayList;
import java.util.List;

interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

class WeatherStation implements Subject {
    private int temperature;
    private List<Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

interface Observer {
    void update(int temperature);
}

class Display implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Temperature updated: " + temperature);
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Display display = new Display();

        station.addObserver(display);

        station.setTemperature(25);

    }
}
