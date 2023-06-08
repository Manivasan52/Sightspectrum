package Task4;

public class TwoDimentionArray {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{4,5,6},{5,6,7}};
	int arr2[][]= {{2,2,2},{2,2,2},{2,2,2}};
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
