public class Main {
    public static void main(String[] args) {
        try {
            Notification sms = NotificationFactory.CreateNotification("SMS");
            sms.notifyUser();
            NotificationFactory.CreateNotification("Email").notifyUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
