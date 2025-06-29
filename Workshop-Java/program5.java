import java.util.ArrayList;
public class ColorList
{
public static void main(String[] args)
{
System.out.println(“Mayank Aylani”); 
System.out.println("Enrollment Number : 0873CS231065");
ArrayList<String> colors=new ArrayList<String>();
colors.add("Red");
colors.add("Blue");
colors.add("Green");
colors.add("Yellow");
colors.add("Purple");
System.out.println("Colors in the list:");
for(String color:colors)
{
System.out.println(color);
}
}
}
