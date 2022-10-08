import java.util.Scanner;

/*
 WAP to check if the String is Anagram or not.
 
 */
public class Question3 {

	public static void main(String[] args) {
		int flag=0;
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=scan.nextLine();
		System.out.println("Enter the Second string");
		String s2=scan2.nextLine();
		if(s1.length()==s2.length())
		{
			for(int i=0; i<s1.length();i++)
			{
				if(!(s1.contains(String.valueOf(s2.charAt(i)))) || !(s2.contains(String.valueOf(s1.charAt(i)))))
				{
				flag=1;
				break;
				}
			}
			if(flag==0)
				System.out.println("Anagram");	
			else
				System.out.println("Not Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}

	}

}
