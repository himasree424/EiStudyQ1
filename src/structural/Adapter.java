package structural;

public class Adapter implements NewSystemInterface {
    private OldSystem oldSystem;

    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void newMethod() {
        oldSystem.oldMethod();
    }
}