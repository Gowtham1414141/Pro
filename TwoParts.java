public class TwoParts {

	public static void main(String[] args) {
		
		int arr[]={4,2,3,4,2};
		String str="";
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			str=str+arr[i];
		}
		for(int i=0;i<arr.length-1;i++)
		{
			String str1 = str.substring(0,i+1);
			String str2 = str.substring(i+1,arr.length);
			int avg1=0,avg2=0;
			int sum1=0;
			for(int j=0;j<str1.length();j++)
			{
				sum1=sum1+Character.getNumericValue(str1.charAt(j));
			}
			avg1 = sum1/str1.length();
			int sum2=0;
			for(int j=0;j<str2.length();j++)
			{
				sum2=sum2+Character.getNumericValue(str2.charAt(j));
			}
			avg2 = sum2/str2.length();
			if(avg1==avg2)
			{
				flag=1;
				System.out.print("[");
				for(int k=0;k<str1.length();k++)
				{
					if(k!=0)
					System.out.print(","+str1.charAt(k));
					else
					System.out.print(str1.charAt(k));
				}
				System.out.print("],[");
				for(int k=0;k<str2.length();k++)
				{
					if(k!=0)
					System.out.print(","+str2.charAt(k));
					else
					System.out.print(str2.charAt(k));
				}
				System.out.print("]");
				break;
			}
		}
		if(flag==0)
			System.out.println("Not possible");
		
	}

}
