import java.util.*;
class Multiplication{
 public static void main(String args[]){
  int num,val,i;
  Scanner sc=new Scanner(System.in);
  System.out.println("Multiplication table\nEnter the number:");
  num=sc.nextInt();
  for(i=1;i<=10;i++)
  {
   val=num*i;
   System.out.println(num+" * "+i+" = "+val);
  }
 }
}
