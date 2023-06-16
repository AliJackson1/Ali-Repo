import java.util.Scanner;

public class FeeInvoiceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Student's Id:");
        String studentId = scanner.nextLine();

        System.out.println("Enter the Student's full name:");
        String fullName = scanner.nextLine();

        System.out.println("Enter CRN/credit hours for the first class (e.g., 5665/3):");
        String[] class1 = scanner.nextLine().split("/");

        System.out.println("Enter CRN/credit hours for the second class (e.g., 5665/3):");
        String[] class2 = scanner.nextLine().split("/");

        System.out.println("Thank you!\n");
        System.out.println("HERE IS THE FEE INVOICE...\n");

        // Calculate the total credit hours and fees
        int creditHours1 = Integer.parseInt(class1[1]);
        int creditHours2 = Integer.parseInt(class2[1]);
        int totalCreditHours = creditHours1 + creditHours2;
        double totalFees = (creditHours1 + creditHours2) * 120.25 + 35.00;

        // Print the fee invoice
        System.out.println("SIMPLE COLLEGE\n");
        System.out.println("ORLANDO FL 10101\n");
        System.out.println("*************************\n");


        System.out.println("Fee Invoice Prepared for:");
        System.out.println("[" + fullName + "][" + studentId + "]\n");

        System.out.println("1 Credit Hour = $120.25\n");

        System.out.println("CRN       CREDIT HOURS");
        System.out.println(class1[0] + "      " + creditHours1);
        System.out.println(class2[0] + "      " + creditHours2);

        System.out.println("          Health & id fees");

        System.out.println("                    $35.00\n");
        System.out.println("               ----------------------------------------");
        System.out.printf("         Total Payments      $%.2f%n", totalFees);

        scanner.close();
    }
}

