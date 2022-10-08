import java.util.Scanner;

//WAP to count the number of Vowels and Consonants of a String value.
public class Question7 {

	public static void main(String[] args) {
		int vowel=0,consonant=0;
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String s1=scan.nextLine();
		s1=s1.toLowerCase();
		
		char a[]=s1.toCharArray();
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==97||a[i]==101||a[i]==105||a[i]==111||a[i]==117)
				vowel++;
			if(a[i]>97&&a[i]<=122&&a[i]!=101&&a[i]!=105&&a[i]!=111&&a[i]!=117)
				consonant++;
		}
		System.out.println("No. of Vowels in the string: "+vowel);
		System.out.println("No. of Consonants in the string: "+consonant);
	}

}
