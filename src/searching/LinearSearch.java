package searching;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,10,40};
		int x = 300;
		boolean resultFound = search(arr,x);
		System.out.println(resultFound);
	}

	private static boolean search(int[] arr, int x) {
		
		boolean searchFound= false;
		int length = arr.length;
		System.out.println(length);
		for(int i=0;i<length;i++){
			if(arr[i]==x){
				searchFound=true;
			}						
		}
		return searchFound;
	}

}
