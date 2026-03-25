package iuh.fit.UIComponentOrganizer;

import java.util.ArrayList;

public class View implements Component {
    private ArrayList<Component> components;

    public View() {
        components = new ArrayList<>();
    }

    public boolean add(Component component) {
        return components.add(component);
    }

    public boolean remove(Component component) {
        return components.remove(component);
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    @Override
    public int count() {
        return components.stream().mapToInt(Component::count).sum();
    }
}
