package Assignments;

public class NumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i a1m goi12ng to fi32nd pro23duct for the num12bers ins12ide th12s str32ing";
		int num=0,mul=1;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				num=(num*10);
				num+=str.charAt(i)-48;
			}
			else 
			{
				if(num>0)
				{
					mul*=num;
					num=0;
				}
			}
		}
		System.out.println(mul);
	}

}
