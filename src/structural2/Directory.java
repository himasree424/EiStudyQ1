package structural2;
import java.util.ArrayList;
import java.util.List;

class Directory implements Component {
    private String name;
    private List<Component> components;

    public Directory(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (Component component : components) {
            component.showDetails();
        }
    }
}
