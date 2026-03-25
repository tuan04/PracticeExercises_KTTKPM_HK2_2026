package iuh.fit.UIComponentOrganizer;

public class TextBox implements Component {
    private String content;

    public TextBox(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println(content);
    }

    @Override
    public int count() {
        return 1;
    }
}
