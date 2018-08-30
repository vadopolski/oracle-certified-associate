package constructor_inheriting;

public class NewTest extends Test {
    
    public NewTest() {
        System.out.println("Inside the constructor");
    }
    
    public NewTest(int i) {
        super(i);
        System.out.println("Inside the constructor");
    }
}
