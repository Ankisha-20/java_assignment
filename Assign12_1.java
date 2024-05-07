import java.util.*;
class Number{
   int arr[];
   
   Number()
   {
   }

   Number(int n)
   {
     Scanner sc = new Scanner(System.in);
     this.arr = new int[n];
     for(int i = 0 ;i<n;i++)
     {
       arr[i] = sc.nextInt();
     }
   }
  
   void display()
   {
     for(int i : arr)
     {
       System.out.println(i + " ");
     }
     System.out.println();
   }
}

class OddNum extends Number{
   int odd_arr[];
   
   OddNum(int n)
   {
     super(n);
     int c =0;
     for(int i:arr)
       {
           if(i %2 !=0)
           {
             c++;
           }
       }
       odd_arr = new int[c];
   }

   void odd()
   {
     int c = 0;
     for(int i :arr)
     {
        if(i%2 != 0)
         {
           odd_arr[c] = i;
           c++;
         }
     }
   }

   void display()
   {
      System.out.println("Odd numbers : ");
      for(int i : odd_arr)
      {
        System.out.println(i + " ");
      }
      System.out.println();
   }
        
}

class PrimeNum extends OddNum{
    int prime_arr[];
    
    PrimeNum(int n)
    {
      super(n);
      int count=0;
      for(int i : odd_arr)
      {
        if(isPrime(odd_arr[i]))
          {
            count++;
          }        
      }
      prime_arr = new int[count];
      //System.out.print("Count : "+count);
    }

    boolean isPrime(int num)
     {
        //System.out.println(num);

        if(num<=1){
           return false;
          }
        for(int i=2;i<=Math.sqrt(num);i++)
         {
           //System.out.println(num);

           if(num%i==0)
            {
//System.out.println(num);
              return false;
            }
         }
         return true;
         
     }    

    void Prime()
    {
      int c=0;
      for(int i : odd_arr)
       {
          if(isPrime(odd_arr[i]))
           {
             prime_arr[c]=odd_arr[i];
             c++;
           }
       }      
    }
   
    void displayprime()
    {
      System.out.println("Prime numbers : ");
      for(int i:prime_arr)
       {
         System.out.print(i+" ");
       }
       System.out.println();
    }
}
class Assign12_1{
   public static void main(String args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array ");
       int n = sc.nextInt();
       PrimeNum p = new PrimeNum(n);
       p.odd();
       p.display();
       p.Prime();
       p.displayprime();
     }
}