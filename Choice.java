import java.util.*;
class Choice{
 public static void main(String args[]){
  int ch;
  Scanner sc=new Scanner(System.in);
  ch=sc.nextInt(); 
  switch(ch){
   case 1:System.out.println("You chose one");
          break;
   case 2:System.out.println("You chose two");
          break;
   case 3:System.out.println("You chose three");
          break;
   case 4:System.out.println("You chose four");
          break;
   case 5:System.out.println("You chose five");
          break;
   default:System.out.println("Invalid choice");
  }  
 }
}
