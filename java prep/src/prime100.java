import java.util.Scanner;

public class prime100 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String  str;
	String rev="";
	System.out.println("ENTER A STRING");
	str=s.nextLine();
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	
	}
}  
