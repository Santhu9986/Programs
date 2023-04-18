package stringsPrgm;

public class SegragateStringWOUsingCharacterclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a2B*C5?d";
		String numeric="";
		String ch="";
		String sch="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				ch+=str.charAt(i);
			}
			else if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				numeric+=str.charAt(i);
			}
			else
				sch+=str.charAt(i);
		}
		System.out.println(ch+" "+numeric+ " "+ sch);
	}

}
