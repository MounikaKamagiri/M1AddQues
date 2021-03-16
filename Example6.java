import java.util.*;

public class Example6{
	public static void main(String args[]){
		Example6 app=new Example6();
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("abc", 50);
		map.put("efg", 70);
		System.out.println(app.result(map));
	}
	
	public Map<String,String> result(Map<String,Integer> map1){
		Map<String,String> map=new HashMap<String,String>();
		String str1=new String();
		String str2=new String();
		int count=0;
		Iterator<String> ite=map1.keySet().iterator();
		while(ite.hasNext()){
			str1=(String)ite.next();
			if(map1.get(str1)>=60){
				str2="PASS";
			}
			else{
				str2="FAIL";
			}
			map.put(str1,str2);}
			return map;
			}
}