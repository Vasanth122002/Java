package RealCodes;

public class Sorting {
public void bubbulesort(int[] arr) {
	boolean isswapped;
	int n = arr.length;
	for(int i=0; i< n-1;i++) {
		isswapped = false;
		for(int j =0;j < n-i-1; j++) {
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				isswapped = true;
			}
		}
		if(isswapped == false) {break;}
	}
	
}
public void PrintArray(int arr[]) {
	int n = arr.length;
	for(int i =0; i< n;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println(" ");
}
public void InsertionSort(int[] arr) {
	int n = arr.length;
	for(int i= 1;i <n;i++) {
		int temp = arr[i];
		int j = i-1;
		while(j>=0 && arr[j]>temp) {
			arr[j+1] = arr[j];			
		j = j-1;
		}
		arr[j+1] = temp;
	}
}
public void SeletionSort(int arr[]) {
	int n = arr.length;
	for(int i=0;i<n;i++) {
		int min = i;
		for(int j=i+1;j<n;j++) {
			if(arr[j]<arr[min])min =j;
		}
		int temp = arr[min];
		arr[min] = arr[i];
		arr[i] = temp;
	}
}
//3.13
public void MergeSort(int arr[],int[]temp,int low,int high) {
	//StackOverflowError - what?
	if(low <high) {
		int mid = low + (high - low)/2;
		MergeSort(arr,temp,low,mid);
		MergeSort(arr,temp,mid+1,high);
		merge(arr,temp,low,mid,high);
	}
}
	private void merge(int[] arr, int[] temp, int low, int mid, int high) {
	for(int i =low;i<=high;i++) {
		temp[i] = arr[i];
	}
	int i= low;int j= mid+1;int k= low;
	while(i<=mid && j<=high) {
		if(temp[i]<=temp[j]) {
			arr[k] = temp[i];
			i++;
		}else {
			arr[k] = temp[j];
			j++;
		}
		k++;
	}
	while(i<=mid) {
		arr[k] = temp[i];
		i++;
		k++;
	}
}
	public void QuickSort(int []arr,int low , int high) {
		if(low<high) {
			int p = partition(arr,low,high);
			QuickSort(arr, low ,p-1);
			QuickSort(arr,p+1 , high);
		}
	}
	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low;
		int j = low;
		while(i<=high) {
			if(arr[i]<=pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
 			}
			i++;
		}
		return j-1;	
	}
	public static void main(String[] args) {
		int[] arr = new int[] {5,1,3,9,10,2};
		Sorting s = new Sorting();
		s.PrintArray(arr);
		s.bubbulesort(arr);
		s.PrintArray(arr);
		s.InsertionSort(arr);
		s.PrintArray(arr);
		s.SeletionSort(arr);
		s.PrintArray(arr);
		s.MergeSort(arr, new int[arr.length], 0, arr.length-1);
		s.PrintArray(arr);
		s.QuickSort(arr, 0, arr.length-1);
		s.PrintArray(arr);
	}
}
