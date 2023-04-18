package stringsPrgm;

public class AdditionOfIntegersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a1111b1211c2";
		int sum=0;
		int tsum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				int n=str.charAt(i)-48;
				tsum=tsum*10+n;
					  
			}
			else
			{
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum=sum+tsum;
		System.out.println(sum);


	}

}
