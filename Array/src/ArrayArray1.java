// assing a random numbers in rows and columns from 0 to 10
// @author elmira amanollahi

public class ArrayArray1 {

    public static void main(String[] args) {
        int[][] myTable = new int[4][4];
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                myTable[row][column] = (int) (Math.random() * 10 + 1);
            }
        }
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                myTable[row][column] = (int) (Math.random() * 10 + 1);

                System.out.print(myTable[row][column] + "      ");
            }

            System.out.println();
        }

        System.out.println("   ");
        System.out.println("   ");

//the sum for column
        int total = 0;
        for (int j = 0; j < myTable[0].length; j++) {

            for (int i = 0; i < myTable.length; i++) {
                total = total + myTable[i][j];
            }
            System.out.println("the sum for column " + j + " is " + total);
        }

        System.out.println("   ");
        System.out.println("   ");

//the sum for row
        int sum = 0;
        for (int i = 0; i < myTable[0].length; i++) {
            for (int j = 0; j < myTable.length; j++) {
                sum = sum + myTable[i][j];
            }
            System.out.println("the sum for row " + i + " is " + sum);
        }
    }

}
