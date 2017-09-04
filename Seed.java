import java.util.*;
public class Seed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		String str = String.valueOf(n);
		int val = n;
		for(int i=0;i<str.length();i++)
		{
			val = val * Character.getNumericValue(str.charAt(i));
		}
		
		System.out.println(n+" is seed of "+val);
	}

}
