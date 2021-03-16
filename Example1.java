import java.util.*;

public class Example1{
	public static void main(String args[]){
		Example1 app=new Example1();
		String arr[]={"goa", "kerala","gujarat"};
		app.run(arr);
		}
	public void run(String arr[]){
		HashMap<String,String> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			String iteratedValue=arr[i];
			String key=iteratedValue.substring(0,3).toUpperCase();
		map.put(key,iteratedValue);
	}
	System.out.println(map);
	}
}