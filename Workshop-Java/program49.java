import java.util.HashMap;
public class ShallowCopyHashMap
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
HashMap<Integer,String> map1=new HashMap<Integer,String>();
map1.put(1,"Apple");
map1.put(2,"Banana");
map1.put(3,"Cherry");
HashMap<Integer,String> map2=(HashMap<Integer,String>)map1.clone();
System.out.println("Original HashMap:");
for(Integer key:map1.keySet())
{
System.out.println(key+" : "+map1.get(key));
}
System.out.println("Shallow copied HashMap:");
for(Integer key:map2.keySet())
{
System.out.println(key+" : "+map2.get(key));
}
}
}
