public class SmsNotifier implements NotificationSystem{
    @Override
    public void sendNotification(String message) {
        IO.println("SMS : " + message);
    }

    @Override
    public void checkStatus() {
        IO.println("SMS delivered ");
    }
}
