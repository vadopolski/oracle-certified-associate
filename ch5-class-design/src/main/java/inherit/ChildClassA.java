package inherit;

public class ChildClassA extends ParentClass {
    protected String value;
    
    public ChildClassA(String name, String value) {
        super(name);
        this.value = value;
        this.type = "A";
        
    }
    
    public ChildClassA(ChildClassA src) {
        super(src);
        this.value = src.value;
    }
}
