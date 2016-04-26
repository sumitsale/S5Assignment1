import java.util.Scanner;

class Rectangle {

	int l,b;
	Rectangle(int x, int y) {
		l = x;
		b = y;
	}
	
	public float rectangleArea() {
		return l*b;
	}

}

	class Triangle extends Rectangle
	{
		int l,h;
		Triangle (int x, int y) {
			super(x,y);
			l = x;
			h = y;
		}
		
		public float triangleArea() {
			return (l*h/2);
		}
	}


public class S5Assignment1
{
	public static void main(String args[])
   {
	Triangle obj = new Triangle(5,6);
	System.out.println("Area of rectangle = " + obj.rectangleArea());
	System.out.println("Area of triangle = " + obj.triangleArea());
   }
}