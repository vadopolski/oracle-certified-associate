public class NestedLoopsExample {
    
    public static void main(String[] args) {
        int [][] matrix = { {5, 5, 7},
                            {6, 8, 9},
                            {4, 8, 0}};
        
        for (int[] row : matrix){
            for (int i = 0; i < row.length; i++){
                System.out.print(row[i] + "\t");
            }
            
            System.out.println();
        }
    }
}
