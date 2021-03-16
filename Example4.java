import java.util.*;
import java.util.stream.*;

public class Example4{
	public static void main(String args[]){
	Example4 app=new Example4();
	List<String> list1=Stream.of("apple","orange","grapes").collect(Collectors.toList());
	List<String> list2=Stream.of("melon","apple","mango").collect(Collectors.toList());
	String string[]=app.getResulted(list1,list2);
	for(String element:string){
		System.out.println(element);
	}
	}
	
	public String[]  getResulted(List<String> list3, List<String> list4) {
		List<String> result=new ArrayList<>();
		for(int i=0;i<list3.size();i++) {
			String element1 = list3.get(i);
			if (element1.charAt(0)=='a' || element1.charAt(0)=='g') {
			continue;	
				
			}
			else{
				result.add(element1);
			}
		}
		for(int i=0;i<list4.size();i++) {
			String element2 = list4.get(i);
			if (element2.charAt(element2.length()-1)=='n' || element2.charAt(element2.length()-1)=='e') {
			continue;		
				
			}
			else{
				result.add(element2);
			}
		}
		String array[]=new String[result.size()];
		for(int i=0;i<result.size();i++){
			array[i]=result.get(i);
		}
		return array;
		
	}
}

	
	
	