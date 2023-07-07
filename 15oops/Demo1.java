class Box
{
int l;
int b;
int h;
void printVolume()
{
int volume = l * b * h;
System.out.println("volume of the box is : " + volume);
}
int fetchSurfaceArea()
{
int surfaceArea = 2 * (l * b + b * h + l * h);
System.out.println("Area returned to caller");
return surfaceArea;
}

void setBoxSize(int x, int y, int z)
{
l = x;
b = y;
h = z;
}
}

class Demo1
{
public static void main(String[] args)
{
Box b1 = new Box();
Box b2 = new Box();
Box b3 = new Box();
b1.setBoxSize(5, 5, 5);
b2.setBoxSize(10, 20, 30);
b3.setBoxSize(25, 35, 45);
b1.printVolume();
System.out.println("Surface of Box b1: " + b1. fetchSurfaceArea());
b2.printVolume();
System.out.println("Surface of Box b2: " + b2. fetchSurfaceArea());
b3.printVolume();
System.out.println("Surface of Box b3: " + b3. fetchSurfaceArea());
}
}