package iuh.fit.UIComponentOrganizer;

public class Input implements Component {
    private String content;

    public Input() {

    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public int count() {
        return 1;
    }
}
