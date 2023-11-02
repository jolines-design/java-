class LoanAccount {
    private double principal;
    private double rate;
    private int time;

    public LoanAccount(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate / 100; // Convert the annual rate to monthly rate
        this.time = time * 12; // Convert years to months
    }

    public double calculateCompoundInterest() {
        double compoundInterest = principal * (Math.pow(1 + rate, time) - 1);
        return compoundInterest;
    }

    public double getTotalAmountPaid() {
        return principal + calculateCompoundInterest();}
}