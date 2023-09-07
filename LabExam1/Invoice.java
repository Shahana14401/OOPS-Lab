import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

interface Calc
{
    void total();
}

class Product1 implements Calc
{
    int pid=101,qty=2,prc=25,total;
    String nme="A";
    public void total()
    {
        total=qty*prc;
    }
}
class Product2 extends Product1 implements Calc
{
    int p_id=102,qnty=1,price=100,totl;
    String name="B";
    Date d=new Date();
    DateFormat df=new SimpleDateFormat("dd/MM/yy");
    public void total()
    {
        super.total();
        totl=qnty*price;
    }
    void display()
    {
        System.out.println("Order No.56");
        System.out.println("Date:"+df.format(d));
        System.out.println("Product Id \t\t\t Name \t\t\t Quantity \t\t\t unitPrice \t\t Total");
        System.out.println("__________________________________________________________________________________________________________________________________");
        System.out.println(pid+"\t\t\t\t"+nme+"\t\t\t\t"+qty+"\t\t\t\t"+prc+"\t\t\t"+total);
        System.out.println(p_id+"\t\t\t\t"+name+"\t\t\t\t"+qnty+"\t\t\t\t"+price+"\t\t\t"+totl);
        System.out.println("__________________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tNet.Amount"+"\t\t\t"+(totl+total));

    }
}
public class Invoice {
    public static void main(String[] args) {
        Product1 p1=new Product1();
        Product2 p2=new Product2();
        p1.total();
        p2.total();
        p2.display();
    }
}
