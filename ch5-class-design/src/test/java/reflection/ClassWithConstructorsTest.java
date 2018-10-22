package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.Test;

public class ClassWithConstructorsTest {
    
    @Test
    public void getName() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ParentClassWithConstructors classWithConstructors = new ChildClassWithConstructors();
    
        System.out.println("Test ");
        
        Class<? extends ParentClassWithConstructors> aClass = classWithConstructors.getClass();
        
        
        Constructor<?> constructorStr = aClass.getConstructor(String.class);
        ParentClassWithConstructors o = (ParentClassWithConstructors)constructorStr.newInstance("Hello, world!");
        System.out.println(((ChildClassWithConstructors)o).getName());
    }
}