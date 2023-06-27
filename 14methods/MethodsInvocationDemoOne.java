class MethodsInvocationDemoOne
{
static int add(int a, int b)
{
int c = a + b;
return c;
}
public static void main(String []args)
{
int result = add(55, 65);
System.out.println("Sum of 55 & 65 is: " + result);
}
}