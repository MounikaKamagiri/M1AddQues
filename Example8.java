import java.util.*;

public class Example8{
	public static void main(String args[]){
		Example8 app=new Example8();
		int arr1[]={1,2,3,4,5};
		int arr2[]={6,7,8,9,10};
		int result[]=app.alternativeIndex(arr1,arr2);
		for(int element:result){
			System.out.println(element);
		}
	}
	public int[] alternativeIndex(int[] arr1,int[] arr2){
		int result[]=new int[arr1.length];
		if(arr1.length==arr2.length){
			for(int i=0;i<arr1.length;i++){
				if(i%2==0){
					result[i]=arr2[i];
				}
				else{
					result[i]=arr1[i];
				}
				
			}
			
		}
		return result;
	}
}
