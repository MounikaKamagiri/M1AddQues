import java.util.*;

public class Example9{
	public static void main(String args[]){
		Example9 app=new Example9();
		String[] s={"red","green","blue","ivory"};
		int n=1;
		System.out.println(app.colourAtIndex(s,n));
	}
	public String colourAtIndex(String[] s,int n){
		String str=new String();
		List<String> list=new ArrayList<String>();
		for(int i=0;i<s.length;i++){
			list.add(s[i]);
		}
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0;i<list.size();i++){
			if(i==(n-1)){
				str=list.get(i);
			}
		}
		return str;
	}
}