package stringsPrgm;

public class LargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"Santhosh","Deepika","Sundeep kumar"};
		String lar=str[0];
		for(int i=0;i<str.length;i++)
		{
				if(lar.length()<str[i].length())
				{
					lar=str[i];
				}
			}
		System.out.println(lar);
		}
}
