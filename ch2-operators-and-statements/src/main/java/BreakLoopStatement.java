public class BreakLoopStatement {

    public String getCoordinatesOfSearchedValue(int[][] matrix, int searchValue) {
        String result;
        System.out.println("Test");
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchValue) {
                    positionX = j;
                    positionY = i;
                    break PARENT_LOOP;
                }
            }
        }

        if (positionX == -1 || positionY == -1) {
            result = "Searched Value: " + searchValue + " is not found";
            System.out.println(result);
        } else {
            result = "Searched value: " + searchValue + "found in coordinates: x:" + positionX + "y: " + positionY;
            System.out.println(result);
        }
        return result;
    }
}