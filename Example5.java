import java.util.*;

public class Example5{
	public static void main(String args[]){
		Example5 app=new Example5();
		boolean result=app.run("Hello*World");
		System.out.println(result);
	}
	public boolean run(String string){
		int index =  string.indexOf("*");
		int beforeIndex=index-1;
		int afterIndex=index+1;
		if(string.charAt(beforeIndex)==(string.charAt(afterIndex))){
			return true;
		}
		else{
			return false;
		
		}
	}
}