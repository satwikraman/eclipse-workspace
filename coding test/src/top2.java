
public class top2 {

	public static void main(String[] args) {
	int[] a= {3,4,12,78,89};
	int temp = 0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
				temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
	System.out.println(a[i]+""+temp);
	}

	}

}
