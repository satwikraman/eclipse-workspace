
import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cents");
		int money=sc.nextInt();
		int m25=0,m10=0,m5=0,m1=0;
		while(money!=0)
		{
			if(money-25>=0)
			{
				m25++;
				money-=25;
			}
			else if(money-10>=0)
			{
				m10++;
				money-=10;
			}
			else if(money-5>=0)
			{
				m5++;
				money-=5;
			}
			else if(money-1>=0)
			{
				m1++;
				money-=1;
			}
		}
		System.out.println("25 cents = "+m25+"\n10 cents = "+m10+"\n5 cents = "+m5+"\n1 cents = "+m1);
		sc.close();
	}

}