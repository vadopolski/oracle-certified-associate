package reflection;

public class ChildClassWithConstructors extends ParentClassWithConstructors {
    private String name;
    
    public ChildClassWithConstructors() {
        this.name = "Test";
    }
    
    public ChildClassWithConstructors(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
}
