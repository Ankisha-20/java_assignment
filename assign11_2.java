import java.util.Scanner;

class JaggedArray {
    private int[][] marks;
    private String[] names = {"Child1", "Child2", "Child3", "Child4", "Child5"};

    // Constructor to allocate memory for the Array exactly as the no of subjects specified for five children
    public JaggedArray(int[] subjects) {
        marks = new int[5][];
        for (int i = 0; i < 5; i++) {j
            marks[i] = new int[subjects[i]];
        }
    }

    // Input marks in different subjects for different children
    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for " + names[i] + ":");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }
    }

    // Show the marks row-wise with child name at the beginning
    public void showMarks() {
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(names[i] + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Show the total marks scored by each child
    public void showTotalMarks() {
        System.out.println("Total Marks:");
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int mark : marks[i]) {
                total += mark;
            }
            System.out.println(names[i] + ": " + total);
        }
    }

    // Count the marks which are more than 80 separately for each child
    public void countMarksAbove80() {
        System.out.println("Marks above 80:");
        for (int i = 0; i < marks.length; i++) {
            int count = 0;
            for (int mark : marks[i]) {
                if (mark > 80) {
                    count++;
                }
            }
            System.out.println(names[i] + ": " + count);
        }
    }

    // Alert them by showing the marks which are less than 30 for better preparation
    public void alertLowMarks() {
        System.out.println("Marks less than 30 (for better preparation):");
        for (int i = 0; i < marks.length; i++) {
            for (int mark : marks[i]) {
                if (mark < 30) {
                    System.out.println(names[i] + ": " + mark);
                }
            }
        }
    }
}

public class assign11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Specify the number of subjects for each child
        int[] subjects = {3, 5, 2, 6, 4};
        JaggedArray jaggedArray = new JaggedArray(subjects);

        // Input marks
        jaggedArray.inputMarks();

        // Show marks
        jaggedArray.showMarks();

        // Show total marks scored by each child
        jaggedArray.showTotalMarks();

        // Count marks above 80 separately for each child
        jaggedArray.countMarksAbove80();

        // Alert for low marks
        jaggedArray.alertLowMarks();
    }
}