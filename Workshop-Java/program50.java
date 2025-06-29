import java.util.HashMap;
public class TestKeyExists
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(1,"Apple");
map.put(2,"Banana");
map.put(3,"Cherry");
int keyToTest=2;
if(map.containsKey(keyToTest))
System.out.println("Key "+keyToTest+" exists in the map.");
else
System.out.println("Key "+keyToTest+" does not exist in the map.");
}
}
