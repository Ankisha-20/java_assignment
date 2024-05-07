import java.util.Scanner;

class TwoDArray {
    private int[][] array;

    // Constructor to allocate memory of size (2 X n) for the array
    public TwoDArray(int n) {
        array = new int[2][n];
    }

    // Input data into the Array
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for 2D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Enter element at position (" + i + "," + j + "): ");
                array[i][j] = scanner.nextInt();
            }
        }
    }

    // Display the array elements in row wise
    public void displayArray() {
        System.out.println("2D Array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Split this array into two different arrays and store them in the array available in two different objects of class OneDArray
    public OneDArray[] splitArray() {
        OneDArray[] oneDArrays = new OneDArray[2];
        for (int i = 0; i < 2; i++) {
            oneDArrays[i] = new OneDArray(array[i].length);
            oneDArrays[i].setArray(array[i]);
        }
        return oneDArrays;
    }

    // Add the arrays(m X n matrices) of two objects of TwoDArray class
    public static TwoDArray addArrays(TwoDArray obj1, TwoDArray obj2) {
        int n = obj1.array[0].length;
        TwoDArray result = new TwoDArray(n);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                result.array[i][j] = obj1.array[i][j] + obj2.array[i][j];
            }
        }
        return result;
    }

    // Multiply the arrays(m X n matrices) of two objects of TwoDArray class
    public static TwoDArray multiplyArrays(TwoDArray obj1, TwoDArray obj2) {
        int n = obj1.array[0].length;
        TwoDArray result = new TwoDArray(n);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                result.array[i][j] = obj1.array[i][j] * obj2.array[i][j];
            }
        }
        return result;
    }
}

class OneDArray {
    private int[] array;

    // Constructor to allocate memory of size (n) as the column size of TwoDArray class
    public OneDArray(int n) {
        array = new int[n];
    }

    // Setter method to set the array
    public void setArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
    }

    // Show the array
    public void showArray() {
        System.out.println("1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class assign11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

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