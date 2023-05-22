package task3;
import java.util.*; 
public class generics {
public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<>();
	list.add("bmw");
	list.add("audi");
	String s=list.get(0);
System.out.println(s+" ");
Iterator<String>itr=list.iterator();
while(itr.hasNext());
System.out.println(itr.next());
	
}
}
