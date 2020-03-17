class TwoNumberSwap
{
 public static void main (String args[])
  {
    int a=8,b=2;
    a=(a+b)-(b=a);
    //a=a^b^(b=a);
    System.out.println("After Swapping values of a and b are :"+a+" "  +b);
   }
}