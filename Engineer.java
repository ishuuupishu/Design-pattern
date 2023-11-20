// Interfaces
interface Workable {
    void doWork();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

// Classes implementing the interfaces
class Engineer implements Workable, Sleepable {
    @Override
    public void doWork() {
        System.out.println("Engineer is working.");
    }

    @Override
    public void sleep() {
        System.out.println("Engineer is sleeping.");
    }
}

class Chef implements Workable, Eatable {
    @Override
    public void doWork() {
        System.out.println("Chef is cooking.");
    }

    @Override
    public void eat() {
        System.out.println("Chef is eating.");
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        Chef chef = new Chef();

        engineer.doWork();
        engineer.sleep();

        chef.doWork();
        chef.eat();
    }
}
