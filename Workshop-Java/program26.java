import java.util.ArrayList;
public class PrintUsingIndex
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list=new ArrayList<String>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");
list.add("Date");
list.add("Elderberry");
System.out.println("Elements using index positions:");
for(int i=0;i<list.size();i++)
{
System.out.println("Element at index "+i+": "+list.get(i));
}
}
}
