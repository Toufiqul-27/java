public class PushNotifier implements NotificationSystem{
    @Override
    public void sendNotification(String message) {
        IO.println("PushNotifier : " + message);
    }

    @Override
    public void checkStatus() {
        IO.println("PushNotifier delivered" );
    }
}
