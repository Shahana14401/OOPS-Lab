import java.util.*;
import pack.arp;
public class FindArea {
    public static void main(String[] args) {
        float area,perimeter;
        Scanner sc=new Scanner(System.in);
        arp h=new arp();
        arp.Rectangle r=h.new Rectangle();
        arp.Circle c=h.new Circle();
        System.out.println("Enter length for rectangle:");
        float l=sc.nextFloat();
        System.out.println("Enter breadth for rectangle:");
        float b=sc.nextFloat();
        System.out.println("Area:"+r.area(l,b));
        System.out.println("Perimeter:"+r.perimeter(l,b));
        System.out.println("Enter radius for circle:");
        float rad=sc.nextFloat();
        float pie=3.14f;
        System.out.println("Area:"+c.area(pie,rad));
        System.out.println("Perimeter:"+c.perimeter(pie,rad));
    }
}
