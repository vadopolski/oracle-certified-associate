package ch5.loops;

public class ForEachExample {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("One");
        sb.append("Two");
        sb.append("Three");

//      incorrect
//        for(Object object: sb){
//            System.out.println("Test");
//        }

        int[] arr = {1, 4, 6, 9};

        for(Object o: arr){
            System.out.println(o);
        }
    }
}