package iuh.fit.NotifyTaskStatus;

public class Client {
    public static void main(String[] args) {
        Participant m1 = new Member("Ha Tuan");
        Participant m2 = new Member("Van Anh");
        Participant m3 = new Member("Ha Tuan 1");

        Task task = new Task("Code chức năng đăng nhập");

        task.subscribe(m1);
        task.subscribe(m2);
        task.subscribe(m3);

        task.setProgress(50);
        task.setProgress(90);
    }
}
