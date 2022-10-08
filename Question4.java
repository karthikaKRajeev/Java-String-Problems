import java.util.Scanner;

/*
  WAP to check if the String is a Pangram or not. 
 */
public class Question4 {

	public static void main(String[] args) {
		
		int flag=0;
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String s1=scan.nextLine();
		String s2=s1.toLowerCase();
	
		
		for(char ch='a'; ch<='z'; ch++)
		{
			if(!(s2.contains(String.valueOf(ch))))
			{
			
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Pangram");
		else
			System.out.println("Not Pangram");

	}

}
