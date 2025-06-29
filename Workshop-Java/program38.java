import java.util.TreeSet;
public class CompareTreeSets
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
TreeSet<String> set1=new TreeSet<String>();
set1.add("Apple");
set1.add("Banana");
set1.add("Cherry");
TreeSet<String> set2=new TreeSet<String>();
set2.add("Apple");
set2.add("Banana");
set2.add("Cherry");
if(set1.equals(set2))
System.out.println("Both TreeSets are equal.");
else
System.out.println("TreeSets are not equal.");
}
}
