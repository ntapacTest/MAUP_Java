package les_04_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Home04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input pascal triangle levels:");
        int triangleLevels=scanner.nextInt();
        
        int [][] triangle=fillPascalTriangle(triangleLevels);
        printTriangle(triangle);
    }

    public static int[][] fillPascalTriangle(int level) {
        int[][] triangle = new int[level][];

        triangle[0] = new int[1];
        triangle[0][0]=1;
        for (int i = 1; i < level; i++) {

            triangle[i] = new int[i+1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
            }
        }

        return triangle;
    }

    public static void printTriangle(int[][] triangle){
        System.out.println("triangle = " + Arrays.deepToString(triangle));
        for (int i = 0; i < triangle.length; i++) {
            System.out.print("|");
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]);
                System.out.print("|");
            }
            System.out.print("\r\n");
        }
    }
}
