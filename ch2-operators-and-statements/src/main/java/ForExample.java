import java.util.ArrayList;
import java.util.List;

public class ForExample {
    public void infiniteLoop() {
        for (; ; ) {
        }
    }
    
    public String multipleTerms() {
        String res = "";
        
        int x = 0;
        for (long y = 0, z = 0; x < 4 && z < 10; x++, y++) {
            res += new Integer(x).toString();
        }
        
        return res;
    }
    
    public String redeclaringTheVariable(){
        String result = "";
        int x = 0;
        int y = 2;
    
        for (x = 4, y = 4; x < 10 && y < 10; x++, y++) {
            result += new Integer(x+y).toString();
        }
        
        return result;
    }
    
    public String uncompatibleTypes(){
        String res = "";
        
//        for(long x = 0, int y = 4; x < 10; x++){      // DOES NOT COMPILE
//
//            res += new Long(x).toString();
//        }
//
        return res;
    }

    public String loopVariablesOutside(){
        String res = "";
        
        for(long x = 0, y = 4; x < 10; x++){
        
            res += new Long(x).toString();
        }
        
//        res += new Integer(y).toString(); DOES NOT COMPILE
        
        return res;
    }
}
