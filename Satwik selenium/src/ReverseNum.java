
public class ReverseNum {

	public static void main(String[] args) {
		int num=12345,n=0;
		while(num>0) {
			n=n*10;
			n=n+(num%10);
			num=num/10;
		}
		System.out.println(n);
	}
}
