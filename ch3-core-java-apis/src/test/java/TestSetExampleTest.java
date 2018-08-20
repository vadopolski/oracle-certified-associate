import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSetExampleTest {
    
    TestSetExample testSetExample = new TestSetExample();
    
    @Test
    public void getDeletedElement() {
        final List<String> set1 = new ArrayList<>();
        set1.add("Vadim");
        set1.add("Alina");
        System.out.println("Set1 is " + set1);
    
        final List<String> set2 = new ArrayList<>();
        set2.add("Alina");
        set2.add("Vadim");
        set2.add("Ivan");
        System.out.println(set2);
    
        List<String> resultDeletedSet = new ArrayList<>(set1);
        resultDeletedSet.removeAll(set2);
        System.out.println(resultDeletedSet);
        System.out.println("Set1 is " + set1);
        
        List<String> resultAddingSet = new ArrayList<>(set2);
        resultAddingSet.removeAll(set1);
        System.out.println(resultAddingSet);
    }
}