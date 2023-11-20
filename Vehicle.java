interface Vehicle {
    void start();

    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}

class VehicleFactory {
    private Vehicle vehicle;

    public VehicleFactory(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void operateVehicle() {
        vehicle.start();
        vehicle.stop();
    }
}

public class ObjectCreationExample {
    public static void main(String[] args) {

        Vehicle car = new Car();
        VehicleFactory carFactory = new VehicleFactory(car);
        carFactory.operateVehicle();

        System.out.println();

        Vehicle motorcycle = new Motorcycle();
        VehicleFactory motorcycleFactory = new VehicleFactory(motorcycle);
        motorcycleFactory.operateVehicle();
    }
}
