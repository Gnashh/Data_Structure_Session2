public class Main {
    public static void main(String[] args) {
        Account credit = new Account("Brandon", "BCA",21313126, 150000);
        System.out.println("Name                : " + credit.getCustomer());
        System.out.println("Bank                : " + credit.getBank());
        System.out.println("Account Number      : " + credit.getAccount());
        System.out.println("Account Card Limit  : " + credit.getLimit());
        System.out.println("Account Balance     : " + credit.getBalance());

        double deposit_amount = 100000;
        credit.deposit(deposit_amount);
        System.out.println("\nTotal deposit = "+ deposit_amount);
        System.out.println("Total Balance = "+ credit.getBalance());

        double payment = 50000;
        credit.charge(payment);
        System.out.println("\nTotal payment : " + payment);
        System.out.println("Payment success.");
        System.out.println("Remaining Balance : " + credit.getBalance());
    }
}