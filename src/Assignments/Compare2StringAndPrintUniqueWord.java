package Assignments;

public class Compare2StringAndPrintUniqueWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is fun show";
		String s1="fun tv show";
		String[] sp=s.split(" ");
		String[] sp1=s1.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			String temp = "";
			for(int j=0;j<sp1.length;j++)
			{
				if(sp[i].equals(sp1[j]) || sp1[j].equals(sp[i])) {
					temp="";
					break;}
				else if(sp[i]!=sp1[j])
					temp=sp[i];
				else if(sp1[j]!=sp[i])
					temp=sp1[j];
				
			}
			if(temp!="")
				System.out.print(temp+" ");
		}

	}

}
