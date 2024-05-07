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
      odd();
      for(int i : odd_arr)
      {
	System.out.println("isPrime test"+count + "i= "+i);
        if(isPrime(i))
          {
			System.out.println("isPrime test");
            count++;
          }        
      }

      prime_arr = new int[count];
    }

    boolean isPrime(int num)
     {
        if(num<=1){
           return false;
          }
        for(int i=2;i<=Math.sqrt(num);i++)
         {
           if(num%i==0)
            {
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
        System.out.println("isPrime test-2");
            
          if(isPrime(i))
           {
             prime_arr[c]=i;
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
class Assign12_11{
   public static void main(String args[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array ");
       int n = sc.nextInt();
       PrimeNum p = new PrimeNum(n);
     //  p.odd();
       p.display();
       p.Prime();
       p.displayprime();
     }
}