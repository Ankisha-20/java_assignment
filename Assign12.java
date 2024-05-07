import java.util.*;
class Vehicle{
   private String Brand;
   private String Country_of_Origin;
   private double Base_price;

   void input()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the details of vehicle: "); 
      System.out.print("Enter the brand : ");
      this.Brand = sc.nextLine();
      System.out.println();
      System.out.print("Enter the Country origin : ");
      this.Country_of_Origin = sc.nextLine();
      System.out.println();
      System.out.print("Enter the base price : ");
      this.Base_price = sc.nextDouble();
      System.out.println();
   }
   
   void display()
   {
     System.out.println("Vehicle Details : ");
     System.out.println("Brand : "+ Brand);
     System.out.println("Country of origin : "+ Country_of_Origin);
     System.out.println("Base price : "+ Base_price);
   }

   public double get_base_price()
   {
      return Base_price;
   }
   
}

class Car extends Vehicle{
     String Model;
     int speed;
     double Market_price;

     void getinput()
     {
       super.input();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Model : ");
       this.Model = sc.nextLine();
       System.out.println();
       System.out.print("Enter the speed of car : ");
       this.speed = sc.nextInt();
       System.out.println();
     }

     double calc_price()
     {
       double base_price = get_base_price();
       if(speed>80)
       {
          Market_price = base_price + 0.15*base_price;
       }
       else
       {
          Market_price = base_price - 0.05*base_price;
       }
       return Market_price;
     }

     void displaydata()
     {
        super.display();
        System.out.println("Model : "+Model);
        System.out.println("Speed : "+speed);
        System.out.println("Market price : "+calc_price());
     }
}

public class Assign12{
   public static void main(String args[]){
      
   Car c = new Car();
   c.getinput();
   c.displaydata();
   } 
}
      