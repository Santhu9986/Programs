package stringsPrgm;

public class SegragateNumericandAlphaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a2B*C5?d";
		String numeric="";
		String ch="";
		String sch="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				ch+=str.charAt(i);
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				numeric+=str.charAt(i);
			}
			else
				sch+=str.charAt(i);
		}
		System.out.println(ch+" "+numeric+ " "+ sch);
//		System.out.println("String after sagrigate");
//		System.out.println("characters: "+ch);
//		System.out.println("Numeric: "+numeric);
//		System.out.println("Special Characters: "+sch);

	}

}
