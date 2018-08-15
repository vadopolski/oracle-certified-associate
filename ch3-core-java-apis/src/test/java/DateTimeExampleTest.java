import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTimeExampleTest {
    DateTimeExample dateTimeExample = new DateTimeExample();
    
    @Test
    public void getListOfDate_noArgs_listWithFamousDate() {
        LocalDate expectedFirstDate = LocalDate.of(1983, Month.AUGUST, 15);
        
        List<LocalDate> date = dateTimeExample.getListOfDate();
        
        assertThat(expectedFirstDate, Is.is(date.get(0)));
    }
    
    @Test
    public void getListOfDateTime_noArgs_listWithFamousDate() {
        LocalDateTime expectedFirstDateTime = LocalDateTime.of(LocalDate.of(1984, Month.AUGUST, 04), LocalTime.of(13, 00));
    
        LocalDateTime actualFirstDateTime = dateTimeExample.getListOfDateAndTime().get(0);
    
        assertThat(actualFirstDateTime, Is.is(expectedFirstDateTime));
    }
}