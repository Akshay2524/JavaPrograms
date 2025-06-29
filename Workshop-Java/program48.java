
import java.util.HashMap;
public class CheckMapEmpty
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
HashMap<Integer,String> map=new HashMap<Integer,String>();
if(map.isEmpty())
System.out.println("Map is empty.");
else
System.out.println("Map contains key-value mappings.");
map.put(1,"Apple");
if(map.isEmpty())
System.out.println("Map is empty.");
else
System.out.println("Map contains key-value mappings.");
}
}
