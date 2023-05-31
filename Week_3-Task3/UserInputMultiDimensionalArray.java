package task3;
import java.util.Scanner;
public class UserInputMultiDimensionalArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the row value :");
	int rows=sc.nextInt();
	System.out.println("enter the coloumn value :");
	int columns=sc.nextInt();
	int [][]multidimensionalArray=new int [rows][columns];
	for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            multidimensionalArray[i][j]= (i + 1) * (j + 1);
        }
    }
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            System.out.print(multidimensionalArray[i][j]+ " ");
        }
	sc.close();
}
}
}
