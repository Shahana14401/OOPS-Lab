import java.util.*;
public class Largest {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Read a");
        a=sc.nextInt();
        System.out.println("Read b");
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println(a + " is larger ");
        }
        else
        {
            System.out.println(b + " is larger ");
        }
    }
    
}
