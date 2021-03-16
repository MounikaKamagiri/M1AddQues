import java.util.*;
import java.util.stream.*;
import java.util.Iterator;

public class Example4{
	public static void main(String args[]){
	Example4 app=new Example4();
	List<String> list1=Stream.of("apple","orange","grapes").collect(Collectors.toList());
	List<String> list2=Stream.of("melon","apple","mango").collect(Collectors.toList());
	app.run(list1,list2);
	}
	
	public void run(List<String> list1, List<String> list2) {
		Iterator<String> iterator1 = list1.iterator();
		Iterator<String> iterator2 = list2.iterator();
		String arr[] = new String[list1.size() + list2.size()];
		int count = 0;
		while (iterator1.hasNext()) {
			String element = iterator1.next();
			if (element.startsWith("a") || element.startsWith("g")) {
				iterator1.remove();
				continue;
			}
			arr[count++] = element;
		}
		while (iterator2.hasNext()) {
			String element = iterator2.next();
			if (element.endsWith("n") || element.endsWith("e")) {
				iterator2.remove();
				continue;
			}
			arr[count++] = element;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i]);
			}
		}
	}
}

	
	
	