class Box
{
int l = 5;
int b = 5;
int h = 5;

void printVolume()
{
int volume = l * b * h;
System.out.println("Volume of the Box is : " + volume);
}

int fetchSurfaceArea()
{
int SurfaceArea = 2 * (l*b + b*h + l*h);
System.out.println("Area return to caller");
return SurfaceArea;
}
}


class Demo
{
public static void main (String []args)
{
Box b = new Box();
// b.printVolume();

int boxSurfaceArea = b.fetchSurfaceArea();
System.out.println("Surface area of box b = " + boxSurfaceArea);
System.out.println("Length of box b = " + b.l);
System.out.println("Breadth of box b = " + b.b);
System.out.println("Height of box b = " + b.h);

b.l = 10;  //Access to change
b.b = 20;
b.h = 30;


System.out.println("Length of box b after change = " + b.l);
System.out.println("Breadth of box b after change = " + b.b);
System.out.println("Height of box b after change = " + b.h);
}
}