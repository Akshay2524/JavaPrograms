import java.util.HashMap;
public class ClearMap
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(1,"Apple");
map.put(2,"Banana");
map.put(3,"Cherry");
System.out.println("Map before clearing:");
for(Integer key:map.keySet())
{
System.out.println(key+" : "+map.get(key));
}
map.clear();
System.out.println("Map after clearing:");
if(map.isEmpty())
{
System.out.println("Map is empty.");
}
else
{
for(Integer key:map.keySet())
{
System.out.println(key+" : "+map.get(key));
}
}
}
}
