package structural;

public class Main {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem();
        NewSystemInterface adapter = new Adapter(oldSystem);
        
        adapter.newMethod();
    }
}
