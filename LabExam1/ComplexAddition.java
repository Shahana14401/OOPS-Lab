public class ComplexAddition
{
    int r,i;
 ComplexAddition(int real,int img)
 {
    r=real;
    i=img;
 }
 void display()
 {
    System.out.println(r  + " + " + i + " i ");
 }
 static void add(int r1,int i1,int r2,int i2)
 {
    r1=r1+r2;
    i1=i1+i2;
    System.out.println(r1 + "+" + i1 + "i");
 }
 public static void main(String[] args)
 {
    ComplexAddition ca1=new ComplexAddition(2,7);
    ComplexAddition ca2=new ComplexAddition(5,3);
    ca1.display();
    ca2.display();
    System.out.println("Addition gives:");
    add(ca1.r,ca1.i,ca2.r,ca2.i);
 }
} 