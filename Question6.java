import java.util.Scanner;

//WAP to sort a String Alphabetically.

public class Question6 {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String s1=scan.nextLine();
		s1=s1.toLowerCase();
		char a[]=s1.toCharArray();
		char temp;
		
		for (int i=0;i<a.length-1;i++)
		{
			for(int j=0; j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		s1=String.valueOf(a);
		System.out.println(s1);
	}

}
