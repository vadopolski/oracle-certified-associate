import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSetExampleTest {
    
    TestSetExample testSetExample = new TestSetExample();
    
    @Test
    public void getDeletedElement() {
        final Set<String> set1 = new HashSet<>();
        set1.add("Vadim");
        set1.add("Alina");
        set1.add("Marina");
        System.out.println("Set1 is " + set1);
    
        final Set<String> set2 = new HashSet<>();
        set2.add("Alina");
        set2.add("Vadim");
        set2.add("Ivan");
        System.out.println(set2);
    
        Set<String> resultDeletedSet = new HashSet<>(set1);
        resultDeletedSet.removeAll(set2);
        System.out.println(resultDeletedSet);
        System.out.println("Set1 is " + set1);
        
        Set<String> resultAddingSet = new HashSet<>(set2);
        resultAddingSet.removeAll(set1);
        System.out.println(resultAddingSet);
    }
}