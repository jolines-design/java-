class BankAccount {
    private double principal;
    private double rate;
    private int time;

    public BankAccount(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateSimpleInterest() {
        return ((principal * rate * time)/100) ;}
}