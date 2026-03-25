package iuh.fit.UIComponentOrganizer;

public class Button implements Component {
    private String placeHolder;

    public Button(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public void onPress(Runnable cb) {
        cb.run();
    }

    @Override
    public int count() {
        return 1;
    }
}
