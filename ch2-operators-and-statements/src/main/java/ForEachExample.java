import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    
    public String arrayToString(final String[] array) {
        String result = "";
        
        for (String st : array) {
            result += st + " ";
        }
        
        return result.trim();
    }
    
    public String listToString(final List<String> list) {
        String result = "";
        
        for (String st : list) {
            result += st + " ";
        }
        
        return result.trim();
    }
    
    public String listToStringWithCommaWithoutSpace(final List<String> nameList){
        String result = "";
        
        for (int i = 0; i < nameList.size(); i++) {
            if (i > 0) {
                result += ", ";
            }
            result += nameList.get(i);
        }
    
        return result;
    }
}