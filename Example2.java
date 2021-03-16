import java.util.*;

public class Example2{
	public static void main(String args[]){
		Example2 app = new Example2();
		HashMap<String, String> map = new HashMap<>();
		map.put("ram", "hari");
		map.put("cisco", "barfi");
		map.put("honeywell", "cs");
		map.put("cts", "hari");
		String array[]=app.convertion(map,"hari");
		for(String element:array){
			System.out.println(element);
		}
		
	}
	public String[]convertion(HashMap<String,String> map,String Value){
	List<String>keysList=new ArrayList<>();
	Set<String> keys=map.keySet();
	for(String key:keys){
		if(map.get(key).equalsIgnoreCase(Value)){
			keysList.add(key);
		}
	}
	String array[]=new String[keysList.size()];
	for(int i=0;i<keysList.size();i++){
		array[i]=keysList.get(i);
	}
	return array;
}
}
	

		