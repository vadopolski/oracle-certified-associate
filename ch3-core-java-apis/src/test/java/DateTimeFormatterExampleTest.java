import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class DateTimeFormatterExampleTest {
    
    private LocalDate date;
    private LocalTime time;
    LocalDateTime dateTime;
    
    
    @Before
    public void setUp() throws Exception {
        date = LocalDate.of(2020, Month.NOVEMBER, 17);
        time = LocalTime.of(11, 34, 10);
        dateTime = LocalDateTime.of(date, time);
    }
    
    @Test
    public void format_test() {
        final String expectDateString = "2020-11-17";
        final String expectDateTimeString = "2020-11-17T11:34:10";
        
        final String actualDateString = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        final String actualDateTimeString = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        
        assertThat(actualDateString, Is.is(expectDateString));
        assertThat(actualDateTimeString, Is.is(expectDateTimeString));
        
        final DateTimeFormatter shortDateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        
        System.out.println(shortDateTimeFormatter.format(dateTime));
        System.out.println(shortDateTimeFormatter.format(date));
        
        final DateTimeFormatter shortDateTimeFormatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        
        System.out.println(dateTime.format(shortDateTimeFormatter2));
        System.out.println(date.format(shortDateTimeFormatter2));
    }
    
    @Test
    public void format_MEDIUM_date_time_test(){
        String expectedDate = "17.11.2020 11:34:10";
        
        final DateTimeFormatter dateTimeFormatterMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        final String actualDate = dateTime.format(dateTimeFormatterMedium);
    
        assertThat(actualDate, Is.is(expectedDate));
    }

    @Test
    public void format_SHORT_date_time_test(){
        final String expectedDate = "17.11.20 11:34";
        
        final DateTimeFormatter dateTimeFormatterShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        final String actualDate = dateTime.format(dateTimeFormatterShort);
    
        assertThat(actualDate, Is.is(expectedDate));
    }

    @Test
    public void format_PATTERN_date_time_test(){
        String expectedDate = "11:34 17.11.2020";
        final DateTimeFormatter dateTimeFormatterPattern = DateTimeFormatter.ofPattern("hh:mm dd.MM.yyyy");
        
        final String actualDate = dateTime.format(dateTimeFormatterPattern);
        
        assertThat(actualDate, Is.is(expectedDate));
    }
}