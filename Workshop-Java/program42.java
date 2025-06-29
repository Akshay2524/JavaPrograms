import java.util.TreeSet;
public class FindLessThanSeven
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
TreeSet<Integer> set=new TreeSet<Integer>();
set.add(1);
set.add(4);
set.add(6);
set.add(8);
set.add(10);
TreeSet<Integer> result=(TreeSet<Integer>)set.headSet(7);
System.out.println("Numbers less than 7 in the TreeSet:");
for(Integer num:result)
{
System.out.println(num);
}
}
}
