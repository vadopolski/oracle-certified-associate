package inherit;

public class ChildClassZ extends ParentClass {
    
    protected int size;
    
    public ChildClassZ(String name, int size) {
        super(name);
        this.size = size;
        this.type = "Z";
    }
    
    public ChildClassZ(ChildClassZ src) {
        super(src);
        this.size = src.size;
    }
}
