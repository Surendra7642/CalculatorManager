class Calculator
{
int first;
int second;
int sumResult;
int subResult;
int mulResult;
int remResult;
double divResult;
   Calculator()
   {
   }
   Calculator(int a,int b)
   {
   first=a;
   second=b;
   }
   public void performAdd()
   {
   sumResult=first+second;
   }
   public void performSub();
   {
   sumResult=first-second;
   }
   
   
}
class CalculatorManager
{
public static void main(Stirng[] args)
{
   Calculator cl=new Calculator(10,5);
   c1.performAdd();
   c1.performSub();
   c1.display();
}