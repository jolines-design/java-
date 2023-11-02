public class Main {
    public static void main(String[] args) {
        // Calculate simple interest for Mr.Bob's deposit
        double depositAmount = 100000;
        double depositRate = 5.0;
        int depositTime = 5;
        BankAccount depositAccount = new BankAccount(depositAmount, depositRate, depositTime);
        double simpleInterest = depositAccount.calculateSimpleInterest();
        System.out.println("Simple Interest for Mr.Bob's deposit: " + simpleInterest + " RWF");

        // Calculate total amount paid for Mr.Bob's loan with compound interest
        double loanAmount = 500000;
        double loanRate = 18.0;
        int loanTime = 3;
        LoanAccount loanAccount = new LoanAccount(loanAmount, loanRate, loanTime);
        double totalAmountPaid = loanAccount.getTotalAmountPaid();
        System.out.println("Total Amount Paid for Mr.Bob's loan with compound interest: " + totalAmountPaid + " RWF");}
}