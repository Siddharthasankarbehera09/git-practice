public class EvenOrOdd
{
public static void main(String args[])
{
Test.checkevenOrOdd(10);
}
}

class Test
{
public static void checkevenOrOdd(int a)
{
if(a%2==0)
System.out.println(a+" is even number");
else
System.out.println(a+" is odd number");
}
}