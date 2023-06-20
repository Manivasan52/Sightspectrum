package task2;

public class FindMaximumNumber {
	public static int  getMaximum(int[] arr,int total)
	{
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[total-1];
	}
	public static void main(String[] args) {
		int arr[]= {5,3,1};
		System.out.println(getMaximum(arr,3));
	}

}
