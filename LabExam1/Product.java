import java.util.*;
public class Product {
    int code;
    float price;
    String name;
    Product(int pcode,float price,String pname)
    {
        this.code=pcode;
        this.price=price;
        this.name=pname;

    }
    void display()
    {
        System.out.println(code + "\t" + price + "\t" + name);
    }

    static void lowest_price(float p1,float p2,float p3)
    {
        if(p1<=p2 && p1<=p3)
        {
            System.out.println(p1 + " is lowest");
        }
        if(p2<=p1 && p2<=p3)
        {
            System.out.println(p2 + " is lowest");
        }
        else
        {
            System.out.println(p3 + " is lowest");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pcode1,pcode2,pcode3;
        String pname1,pname2,pname3;
        float price1,price2,price3;

        pcode1=sc.nextInt();
        pcode2=sc.nextInt();
        pcode3=sc.nextInt();
        price1=sc.nextFloat();
        price2=sc.nextFloat();
        price3=sc.nextFloat();
        pname1=sc.next();
        pname2=sc.next();
        pname3=sc.next();
        sc.close();

        Product obj1=new Product(pcode1, price1, pname1);
        Product obj2=new Product(pcode2, price2, pname2);
        Product obj3=new Product(pcode3, price3, pname3);


        obj1.display();
        obj2.display();
        obj3.display();
        lowest_price(obj1.price, obj2.price, obj3.price);

    }
}
