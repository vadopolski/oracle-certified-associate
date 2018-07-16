public class CaseExample {
    
    
    public int getSortOrder(String firstName, final String lastName){
        int id = 0;
        String middleName = "Anatoljevich";
        final String suffix = "T";
        
        switch (firstName){
            case "Test" :
                return 10;
//            case middleName : Does Not Compile
//                id = 2;
//                break;
            case suffix :
                id = 3;
                break;
//            case lastName : Does Not Compile
//                id = 4;
//                break;
//            case 5 :
//                id = 4;
//                break;
//            case '5' :
//                id = 5;
//                break;
//            case DayOfWeek.FRIDAY :
//                id = 6;
//                break;
        }
        
        return id;
    }
    
}
