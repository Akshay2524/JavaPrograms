public class CircleArea
{
double radius; 
double area;
void setRadius(double r)
{
radius=r;
}
void calculateArea()
{
area=Math.PI*radius*radius;
}
void displayArea()
{
System.out.println("Radius : "+radius);
System.out.println("Area of Circle : "+area);
}
public static void main(String[] args)
{
System.out.println("Mayank Aylani");
System.out.println("Enrollment Number : 0873CS231065");
CircleArea circle=new CircleArea();
circle.setRadius(5.0);
circle.calculateArea();
circle.displayArea();
}
}
