public class WhileExample {


    public int eatCheeseMethodWithWhile(int byteOfCheese){
        int roomInBelly = 5;
        
        while (roomInBelly > 0 && byteOfCheese > 0) {
            roomInBelly--;
            byteOfCheese--;
        }
        
        return roomInBelly;
    }
    
    public int eatCheeseMethodWithDoWhile(int byteOfCheese){
        int roomInBelly = 5;
        
        do {
            roomInBelly--;
            byteOfCheese--;
        } while (roomInBelly > 0 && byteOfCheese > 0);
        
        return roomInBelly;
    }
    
}
