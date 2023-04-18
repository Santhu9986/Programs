package stringsPrgm;

public class AdditionOf2DigitsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a1111b1211c2";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			int digit=0;
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				digit=str.charAt(i)-48;
				if(i<str.length()-1)
				{
					i++;
					if(str.charAt(i)>='0' && str.charAt(i)<='9') {
						digit=(digit*10)+(str.charAt(i)-48);	
					}
				}					  
			}
			sum+=digit;
		}
		System.out.println(sum);

	}

}
