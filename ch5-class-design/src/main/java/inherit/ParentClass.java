package inherit;

public class ParentClass {
    protected String name;
    protected String type;
    
    public ParentClass(String name) {
        this.name = name;
        this.type = "Parent";
    }
    
    public ParentClass(ParentClass src){
        this.name = src.name;
        this.type = src.type;
    }
}
