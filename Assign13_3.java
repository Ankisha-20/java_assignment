import java.util.Scanner;

interface IntOperations {
    boolean isPositive();
    boolean isNegative();
    boolean isEven();
    boolean isOdd();
    boolean isPrime();
    boolean isPalindrome();
    int factorial();
    int sumOfDigits();
}

class MyNumber implements IntOperations {
    private int number;

    // Default constructor
    public MyNumber() {
        this.number = 0;
    }

    // Constructor with initialization
    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPositive() {
        return number > 0;
    }

    public boolean isNegative() {
        return number < 0;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public boolean isPrime() {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public boolean isPalindrome() {
        int temp = number;
        int reverse = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }
        return number == reverse;
    }

    public int factorial() {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public int sumOfDigits() {
        int sum = 0;
        int temp = Math.abs(number);
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}

public class Assign13_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        MyNumber myNumber = new MyNumber(num);
        int choice;
        do{
        System.out.println("1. Check if positive");
        System.out.println("2. Check if negative");
        System.out.println("3. Check if even");
        System.out.println("4. Check if odd");
        System.out.println("5. Check if prime");
        System.out.println("6. Check if palindrome");
        System.out.println("7. Find factorial");
        System.out.println("8. Find sum of digits");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Positive: " + myNumber.isPositive());
                break;
            case 2:
                System.out.println("Negative: " + myNumber.isNegative());
                break;
            case 3:
                System.out.println("Even: " + myNumber.isEven());
                break;
            case 4:
                System.out.println("Odd: " + myNumber.isOdd());
                break;
            case 5:
                System.out.println("Prime: " + myNumber.isPrime());
                break;
            case 6:
                System.out.println("Palindrome: " + myNumber.isPalindrome());
                break;
            case 7:
                System.out.println("Factorial: " + myNumber.factorial());
                break;
            case 8:
                System.out.println("Sum of digits: " + myNumber.sumOfDigits());
                break;
            case 9:
                System.out.println("Exit....");
                break;
            default:
                System.out.println("Invalid choice!");
        }

}while(choice!=9);
   //scanner.close();

    }
}
