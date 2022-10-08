/*
 WAP to reverse a sentence while preserving the position.
Input : “Think Twice”
Output : “kniht eciwt”

 */
public class Question2 {

	public static void main(String[] args) {
		String s1="Think Twice";
		String s2="";
		String s3=s1.toLowerCase();
		String a[]=s3.split(" ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=a[i].length()-1; j>=0;j--)
			{
				s2=s2+a[i].charAt(j);
			}
		s2=s2+" ";
		}
		System.out.print(s2);
	}

}
