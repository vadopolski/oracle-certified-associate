import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DateTimeExample {
    
    public List<LocalDate> getListOfDate() {
        List<LocalDate> result = new ArrayList<>();
        
        result.add(LocalDate.of(1984, 8, 04));
        result.add(LocalDate.of(1983, 8, 15));
        result.add(LocalDate.now());
        
        Collections.sort(result);
        
        return result;
    }
    
    public List<LocalDateTime> getListOfDateAndTime(){
        List<LocalDateTime> result = new ArrayList<>();
        
        result.add(LocalDateTime.of(1999, 12, 31, 23, 59));
        result.add(LocalDateTime.of(1984, Month.AUGUST, 04, 13, 00));
        result.add(LocalDateTime.of(LocalDate.of(1989, Month.NOVEMBER, 19), LocalTime.now()));
    
        Collections.sort(result);
        
        System.out.println(result.get(0));
        
        return result;
    }
    
}
