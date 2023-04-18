package stringsPrgm;

public class FindMinimumLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"abc","abcdd","abcd","ab","dv"};
		String min=str[0];
		for(int i=0;i<str.length;i++)
		{
			if(min.length()>str[i].length())
				min=str[i];
		}
		System.out.println(min);
		for(int i=0;i<str.length;i++)//if 2 values having same length 
		{
			if(min.length()==str[i].length())
				System.out.print(str[i]+" "); //Printing values which is same length
		}
	}
}