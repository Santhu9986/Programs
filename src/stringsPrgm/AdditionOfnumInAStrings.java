package stringsPrgm;

public class AdditionOfnumInAStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a11b12c2";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				sum+=str.charAt(i)-48;//ascii value 0 starts from 48 so subtracting the ascii value will get absolute value 
									  //For ex ascii value of 2 is 50, then 50-48=2
			}
		}
		System.out.println(sum);
	}

}
