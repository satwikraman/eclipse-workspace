
public class ArraySum {

	public static void main(String[] args) {
		int arr[] = {1,2,3,5};
		int res;
		for (int i = 0; i < arr.length; i++) {
			res=1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]!=arr[j]) {
					res=arr[j]*res;
				}
			}
			System.out.println(arr[i]+" "+res);
		}
	}

}
