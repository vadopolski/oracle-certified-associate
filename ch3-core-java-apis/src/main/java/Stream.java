import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    
    public static String join( List<Integer> collection, String delimiter )
    {
        return collection.stream()
            .map( Object::toString )
            .collect( Collectors.joining( delimiter ) );
    }
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,6,8,9);
    
        System.out.println(list);
    
        String join = join(list, "; ");
    
        System.out.println(join);
    
    }
}
