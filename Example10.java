import java.util.*;

public class Example10{
	public static void main(String args[]){
		Example10 app = new Example10();
		int[] arr1={1,2,3,4};
		int[] arr2={3,4,5,6};
		System.out.println(app.mergeArray(arr1,arr2));
	}
	public int mergeArray(int arr1[],int arr2[]){
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		int sum=0;
		for(int i=0;i<list1.size();i++){
			list1.add(arr1[i]);
		}
		for(int i=0;i<list2.size();i++){
			list2.add(arr2[i]);
		}
		list1.retainAll(list2);
		for(int i:list1){
			sum+=(Integer)list1.get(i);
		}
		return sum;
	}
}	
		