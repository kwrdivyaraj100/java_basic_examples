class ConditionalStatementsDemoThree
{
public static void main(String args[])
{
int p = 5;

if(p == 0 )
{
System.out.println("Value of p = 0");
}
else if(p==1)
{
System.out.println("Value of p=1");
}
else if(p==5)
{
System.out.println("Value of p=5");
}
else
{
System.out.println("Value of p is not 0,1 or 5");
}
System.out.println("End of If/else chain");
}
}