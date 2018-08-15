import java.util.Optional;

public class OptionalTest {
    
    public static void main(String[] args) {
        final String nullString = null;
    
        System.out.println("Test Test ");
        
        Optional<String>  o = Optional.ofNullable(nullString);
    
        System.out.println(o.get());
        
    }
    
}
