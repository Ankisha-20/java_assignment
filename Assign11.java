import java.util.*;
public class TwoDArray{
 
  int arr[][];

   TwoDArray(int n)
   {
     this.arr = new int[2][n];
   } 

   void getData()
   {
      Scanner sc = new Scanner(System.in);
      int i,j;
      System.out.println("Enter the values of 2D array : ");
      for(i=0;i<2;i++)
      {
         for(j=0;j<arr[0].length;j++)
          {
             arr[i][j] = sc.nextInt();
          }
      }
   }

   void DisplayData()
   {
     System.out.println("2D Array Elements : ");
     int i,j;
     for(i=0;i<2;i++)
      {
         for(j=0;j<arr[0].length;j++)
          {
             System.out.println(arr[i][j]);
          }
          System.out.print("\n");
      }
   }
 
   public OneDArray[] splitArray() {
        OneDArray[] oneDArrays = new OneDArray[2];
        for (int i = 0; i < 2; i++) {
            oneDArrays[i] = new OneDArray(arr[i].length);
            oneDArrays[i].setArray(arr[i]);
        }
        return oneDArrays;
    }

   
    public static TwoDArray addArrays(TwoDArray obj1, TwoDArray obj2) {
        int n = obj1.arr[0].length;
        TwoDArray result = new TwoDArray(n);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                result.arr[i][j] = obj1.arr[i][j] + obj2.arr[i][j];
            }
        }
        return result;
    }

    public static TwoDArray multiplyArrays(TwoDArray obj1, TwoDArray obj2) {
        int n = obj1.arr[0].length;
        TwoDArray result = new TwoDArray(n);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                result.arr[i][j] = obj1.arr[i][j] * obj2.arr[i][j];
            }
        }
        return result;
    }
}

 public class OneDArray{
    int arr1[];
   
    OneDArray(int n)
    {
      this.arr1 = new int[n];
    }

    public void setArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
    }

    
    public void showArray() {
        System.out.println("1D Array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
}

public class Assign11{
  public static void main(String args[]);
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of n : ");
      int n = sc.nextInt();

      TwoDArray obj1 = new TwoDArray(n);
        TwoDArray obj2 = new TwoDArray(n);

        System.out.println("Enter elements for first 2D array:");
        obj1.inputData();

        System.out.println("Enter elements for second 2D array:");
        obj2.inputData();

        // Displaying first 2D array
        obj1.displayArray();

        // Displaying second 2D array
        obj2.displayArray();

        // Splitting first array
        OneDArray[] oneDArrays1 = obj1.splitArray();
        // Splitting second array
        OneDArray[] oneDArrays2 = obj2.splitArray();

        // Displaying first 1D array
        oneDArrays1[0].showArray();
        // Displaying second 1D array
        oneDArrays1[1].showArray();
        // Displaying third 1D array
        oneDArrays2[0].showArray();
        // Displaying fourth 1D array
        oneDArrays2[1].showArray();

        // Adding arrays
        TwoDArray additionResult = TwoDArray.addArrays(obj1, obj2);
        additionResult.displayArray();

        // Multiplying arrays
        TwoDArray multiplicationResult = TwoDArray.multiplyArrays(obj1, obj2);
        multiplicationResult.displayArray();

    }
}
}