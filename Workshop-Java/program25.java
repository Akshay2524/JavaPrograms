import java.util.ArrayList;
public class ReplaceSecondElement
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list=new ArrayList<String>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");
System.out.println("Before replacing:");
for(String item:list)
{
System.out.println(item);
}
list.set(1,"Blueberry");
System.out.println("After replacing second element:");
for(String item:list)
{
System.out.println(item);
}
}
}
