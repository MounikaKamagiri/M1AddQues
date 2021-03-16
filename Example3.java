import java.util.*;
import java.util.stream.*;

public class Example3{
	public static void main(String args[]){
	Example3 app=new Example3();
	List<Integer> list1=Stream.of(1,2,3,4).collect(Collectors.toList());
	List<Integer> list2=Stream.of(1,2,3,5).collect(Collectors.toList());
	Integer array[]=app.unique(list1,list2);
	for(Object element:array){
		System.out.println(element);
	}
}
	
	public Integer[] unique(List<Integer> list1,List<Integer> list2){
		List<Integer> unique1=new ArrayList(list1);
		unique1.removeAll(list2);
		List<Integer> unique2=new ArrayList(list2);
		unique2.removeAll(list1);
		List<Integer> uniqueList= new ArrayList<>();
		uniqueList.addAll(unique1);
		uniqueList.addAll(unique2);
		
		Integer array[]=new Integer[uniqueList.size()];
		for(int i=0;i<uniqueList.size();i++){
		array[i]=uniqueList.get(i);
		}
		return array;
	}
}
