import java.util.Scanner;
public class MainRunner 
{
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the Sentence:");
	String st=sc.nextLine();
	char ch[]=st.toCharArray();
	String longString="";
	for (int i = 0; i < ch.length; i++) 
	{
		String temp="";
		int k=i;
		while(k<ch.length&&!temp.contains(ch[k]+""))
		{	
			temp=temp+ch[k];
			k++;
		}
		if(temp.length()>longString.length())
			longString=temp;
	}
	System.out.println(longString);
}
}