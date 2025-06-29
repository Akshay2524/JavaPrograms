import java.util.HashMap;
public class CopyMap
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
HashMap<Integer,String> map1=new HashMap<Integer,String>();
map1.put(1,"Apple");
map1.put(2,"Banana");
map1.put(3,"Cherry");
HashMap<Integer,String> map2=new HashMap<Integer,String>();
map2.putAll(map1);
System.out.println("Contents of second map after copying:");
for(Integer key:map2.keySet())
{
System.out.println(key+" : "+map2.get(key));
}
}
}
