interface Command {
    void execute();
}

class Light {
    void turnOn() {
        System.out.println("Light is on");
    }

    void turnOff() {
        System.out.println("Light is off");
    }
}

class Fan {
    void turnOn() {
        System.out.println("Fan is on");
    }

    void turnOff() {
        System.out.println("Fan is off");
    }
}

class LightOnCommand implements Command {
    private Light light;

    LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;

    LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

class FanOnCommand implements Command {
    private Fan fan;

    FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOn();
    }
}

class FanOffCommand implements Command {
    private Fan fan;

    FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOff();
    }
}

class RemoteControl {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void pressButton() {
        command.execute();
    }
}

public class CommandPatternExample {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);

        Command ceilingFanOn = new FanOnCommand(ceilingFan);
        Command ceilingFanOff = new FanOffCommand(ceilingFan);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(livingRoomLightOn);
        remoteControl.pressButton();

        remoteControl.setCommand(livingRoomLightOff);
        remoteControl.pressButton();

        remoteControl.setCommand(ceilingFanOn);
        remoteControl.pressButton();

        remoteControl.setCommand(ceilingFanOff);
        remoteControl.pressButton();
    }
}
