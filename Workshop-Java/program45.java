import java.util.HashSet;
public class RemoveAllElements
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
HashSet<String> set=new HashSet<String>();
set.add("Apple");
set.add("Banana");
set.add("Cherry");
System.out.println("HashSet before removing all elements:");
for(String item:set)
{
System.out.println(item);
}
set.clear();
System.out.println("HashSet after removing all elements:");
if(set.isEmpty())
{
System.out.println("HashSet is empty.");
}
else
{
for(String item:set)
{
System.out.println(item);
}
}
}
}

