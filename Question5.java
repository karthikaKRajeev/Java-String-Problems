import java.util.Scanner;

/*
 WAP to print repeatedly occurring characters in the given String.
 */
public class Question5 {

	public static void main(String[] args) {
		int flag=0;
		String s2="";
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String s1=scan.nextLine();
		s1=s1.toLowerCase();
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if((s1.charAt(i)==s1.charAt(j)))
				{
					
					flag=1;
					s2=s2+s1.charAt(i)+" ";	
					break;
				}
			}
			
		}
		
		//System.out.println(s2);
		if(flag==0)
			System.out.println("No character is repeating in the string");
		
		else
		{    
			String temp = "";
	         for (int i = 0; i < s2.length(); i++){
	            if (temp.indexOf(s2.charAt(i)) == - 1){
	               temp = temp + s2.charAt(i)+" ";
	               
	         }
	      }
	         
	    System.out.println("The characters repeating in string : "+ temp);
		}
	}
}
