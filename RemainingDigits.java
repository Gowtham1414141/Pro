import java.util.*;
public class RemainingDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		String str = String.valueOf(n);
		String arr[] = str.split("");
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=Integer.parseInt(arr[i]);
		}
		Arrays.sort(arr1);
		int k = sc.nextInt();
		for(int i=0;i<arr1.length-k;i++)
		{
			System.out.print(arr1[i]);
		}
	}

}
