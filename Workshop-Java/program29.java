import java.util.LinkedList;
public class IterateFromPosition
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
LinkedList<String> list=new LinkedList<String>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");
list.add("Date");
list.add("Elderberry");
int startIndex=2;
System.out.println("Iterating from index "+startIndex+":");
for(int i=startIndex;i<list.size();i++)
{
System.out.println(list.get(i));
}
}
}
