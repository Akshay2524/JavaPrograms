import java.util.HashSet;
public class CompareHashSets
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
HashSet<String> set1=new HashSet<String>();
set1.add("Apple");
set1.add("Banana");
set1.add("Cherry");
HashSet<String> set2=new HashSet<String>();
set2.add("Apple");
set2.add("Banana");
set2.add("Cherry");
if(set1.equals(set2))
System.out.println("Both HashSets are equal.");
else
System.out.println("HashSets are not equal.");
}
}
