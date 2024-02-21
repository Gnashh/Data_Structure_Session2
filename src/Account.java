class Account {
    private String customer;
    private String bank;
    private int account;
    private double balance;
    private double limit = 500000;
    private double charge;

    public Account(String customer, String bank, Integer account, double balance){
        this.customer = customer;
        this.bank = bank;
        this.account=account;
        this.balance=balance;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public int getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public void charge(double payment) {
        if (payment >= limit){
            System.out.println("Your payment is over your limit.");
        }
        else {
            balance -= payment;
        }
    }
    public double getLimit() {
        return limit;
    }
}
