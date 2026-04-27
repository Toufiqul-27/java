public class EmailNotifier implements NotificationSystem{
    @Override
    public void sendNotification(String message) {
        IO.println("Email : " + message);
    }

    @Override
    public void checkStatus() {
        IO.println("email delivered");
    }
}
