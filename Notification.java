public class Notification {
    private MsgNotification msgNotification;
    private CallNotification callNotification;

    public Notification() {
        this.msgNotification = new msgNotification();
        this.callNotification = new callNotification();

    }

    void notify() {
        msgNotification.notify();
        callNotification.notify();
    }
}

class MsgNotification {
    void notify() {

    }
}

class CallNotification {
    void notify() {

    }
}

interface INotification {
    void notify();

}

class Notification {
    private INotification notification;

    public Notification(INotification notification) {
        this.notification = notification;
    }

    public void notify() {
        notification.notify();
    }
}

class MsgNotification implements INotification {
    @override
    public void notify() {

    }
}

class CallNotification implements INotification {
    @override
    public void notify() {

    }
}

public class Main {
    public static void main(String[] args) {
        INotification msgNotification = new MsgNotification();
        Notification msg = new Notification(msgNotification);
        msg.notify();

        INotification callNotification = new CallNotification();
        Notification call = new Notification(callNotification);
        call.notify();
    }
}
