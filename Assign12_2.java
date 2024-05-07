import java.util.Scanner;

class Number {
     int[] array;

    // Constructor to allocate memory for the array and input numbers into the array
    public Number(int n) {
        array = new int[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
    }

    // Method to display all the values in the array
    public void display() {
        System.out.println("Numbers:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class OddNum extends Number {
     int[] oddArray;

    // Constructor to count the odd numbers present in the array of its base class Number
    // and accordingly allocate memory for its own array
    public OddNum(Number number) {
        super(number.array.length);
        int count = 0;
        for (int num : number.array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        oddArray = new int[count];
    }

    // Method to copy all odd numbers from its base class array to its own array
    public void copyOddNumbers() {
        int index = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                oddArray[index++] = num;
            }
        }
    }

    // Method to display all odd numbers
    public void displayOddNumbers() {
        System.out.println("Odd Numbers:");
        for (int num : oddArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class PrimeNum extends OddNum {
     int[] primeArray;

    // Constructor to count the prime numbers present in the array of its base class OddNum
    // and accordingly allocate memory for its own array
    public PrimeNum(OddNum oddNum) {
        super(oddNum);
        int count = 0;
        for (int num : oddNum.oddArray) {
            if (isPrime(num)) {
                count++;
            }
        }
        primeArray = new int[count];
    }

    // Method to copy all prime numbers from its base class array to its own array
    public void copyPrimeNumbers() {
        int index = 0;
        for (int num : oddArray) {
            if (isPrime(num)) {
                primeArray[index++] = num;
            }
        }
    }

    // Method to display all prime numbers
    public void displayPrimeNumbers() {
        System.out.println("Prime Numbers:");
        for (int num : primeArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Utility method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Assign12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Create an object of the base class Number
        Number number = new Number(n);

        // Display all numbers
        number.display();

        // Create an object of the derived class OddNum
        OddNum oddNum = new OddNum(number);

        // Copy odd numbers and display them
        oddNum.copyOddNumbers();
        oddNum.displayOddNumbers();

        // Create an object of the derived class PrimeNum
        PrimeNum primeNum = new PrimeNum(oddNum);

        // Copy prime numbers and display them
        primeNum.copyPrimeNumbers();
        primeNum.displayPrimeNumbers();
    }
}