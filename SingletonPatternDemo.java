class SingleObject {
    private static SingleObject instance = new SingleObject();

    SingleObject() {

    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World");
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = new SingleObject();
        object.showMessage();
    }
}