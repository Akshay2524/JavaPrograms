import java.util.ArrayList;
public class CompareArrayLists
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> list1=new ArrayList<String>();
list1.add("Apple");
list1.add("Banana");
list1.add("Cherry");
ArrayList<String> list2=new ArrayList<String>();
list2.add("Apple");
list2.add("Banana");
list2.add("Cherry");
if(list1.equals(list2))
System.out.println("Both ArrayLists are equal.");
else
System.out.println("ArrayLists are not equal.");
}
}
