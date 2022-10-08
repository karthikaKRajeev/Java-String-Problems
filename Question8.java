import java.util.Scanner;

//WAP to count number of special characters.
public class Question8 {

	public static void main(String[] args) {
		int special=0;
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String s1=scan.nextLine();
		s1=s1.toLowerCase();
		char a[]=s1.toCharArray();

		for (int i=0;i<a.length;i++)
		{
		
			if((a[i]>=33&&a[i]<=47)||(a[i]>=58&&a[i]<=64)||a[i]>=91&&a[i]<=96||a[i]>=123&&a[i]<=126)
				special++;
		}
		System.out.println("No. of special characters in the string: "+special);
	}

}
