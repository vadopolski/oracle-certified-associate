public class ContinueBreakStatement {
    
    public String getStringStatement() {
        String result = "";
        
        OUTER_LOOP:
        for (int i = 1; i <= 3; i++) {
            for (char j = 'a'; j < 'c'; j++) {
                if (j == 'b')
                    continue OUTER_LOOP;
                result += i + Character.toString(j);
                if (i != 3)
                    result += " ";
            }
        }
        
        return result;
    }
}
