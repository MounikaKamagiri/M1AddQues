import java.util.*;
import java.util.Iterator;

public class Example7{
	public static void main(String args[]){
		Example7 app = new Example7();
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1,4);
		map.put(2,6);
		map.put(4,7);
		map.put(5,9);
		System.out.println(app.avgValues(map));
	}
	public int avgValues(Map<Integer,Integer>map){
		int j=0, m=0;
		Iterator<Integer> i=map.keySet().iterator();
		while(i.hasNext()){	
			int n=(Integer) i.next();
			if(n%2!=0){
				m+=map.get(n);
				j++;}}
			return m/j;
	}
}	
