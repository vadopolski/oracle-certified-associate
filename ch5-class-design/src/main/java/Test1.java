import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {
    
    public static void main(String[] args) {
        final Map<String, String> optionalHeaders = new HashMap<>();
    
        if(optionalHeaders == null){
            System.out.println("Test");
        }
    
        Set<Map.Entry<String, String>> entries = optionalHeaders.entrySet();
    
        boolean isMasked = false;
        
        final String str = isMasked ? "Masked" : "Not Masked";
    
        System.out.println(str);
        
        final String str2;
        
        
    }
}