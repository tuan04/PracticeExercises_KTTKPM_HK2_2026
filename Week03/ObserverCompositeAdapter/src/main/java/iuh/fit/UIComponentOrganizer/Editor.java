package iuh.fit.UIComponentOrganizer;

public class Editor {
    public static void main(String[] args) {
        View login = new View();

        TextBox title = new TextBox("Đăng nhập");
        login.add(title);

        View inputBox = new View();
        Input username = new Input();
        Input password = new Input();
        inputBox.add(username);
        inputBox.add(password);
        login.add(inputBox);

        Button loginBtn = new Button("Đăng nhập");
        login.add(loginBtn);

        System.out.println("Trong login view có: " + login.count() + " components");

        loginBtn.onPress(() -> System.out.println("Ấn nút login"));
    }
}
