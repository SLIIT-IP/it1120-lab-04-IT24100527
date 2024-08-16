import java.util.Scanner;

public class IT24100527Lab4Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter exam marks (out of 100): ");
        int examMarks=input.nextInt();
        if (examMarks<0 || examMarks>100) {
           System.out.println("Invalid input for exam marks. Terminating program.");
           return;
        }
         
        System.out.print("Please enter lab submission marks (out of 100): ");
        int labMarks=input.nextInt();
        if (labMarks<0 || labMarks>100) {
           System.out.println("Invalid input for lab submission marks. Terminating program.");
           return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        int examPrecentage=input.nextInt();
        if (examPrecentage<0 || examPrecentage>100) {
           System.out.print("Invalid input for percentage. Terminating program.");
           return;
        }
       
        System.out.print("Please enter the percentage given for lab submissions: ");
        int labPrecentage=input.nextInt();
        if (labPrecentage<0 || labPrecentage>100) {
           System.out.print("Invalid input for percentage. Terminating program.");
           return;
        }
        
        if (examPrecentage+labPrecentage !=100) {
           System.out.println("The percentages must add up to 100. Terminating program.");
           return;
        }

        double finalMark=(examMarks*(examPrecentage/100.0))+(labMarks*(labPrecentage/100.0));
        System.out.println("Final Exam Mark is: " + finalMark);
   }
}
