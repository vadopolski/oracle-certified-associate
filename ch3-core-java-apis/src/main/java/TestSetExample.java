import java.util.List;

public class TestSetExample {
    
    public List<String> getDeletedElement(List<String> originalList, List<String> resultList){
        if(resultList.size() < originalList.size()){
            
            originalList.removeAll(resultList);
        }
        
        return originalList;
    }
    
}
