class Bank {
  
    public static double balance = 300.0;

    public static void main(String [] args) {
      addBalance(15.50);
      viewBalance();
      removeBalance(45.90);
      viewBalance();
      savingsAcc(300);
      viewBalance();
      payLoan(300);
      viewBalance();
    }

    public static void addBalance (double earnedMoney){
      balance = balance + earnedMoney;
    }

    public static void removeBalance(double spentMoney){
      balance = balance - spentMoney;
    }

    public static void viewBalance(){
      System.out.println(balance);
    }

    public static void savingsAcc(double investment){
      balance = balance + investment * 0.05;
    }
    
    public static void payLoan(double loan){
      balance = balance - loan * 1.05;
    }

    //This is Draft #1 for Banking Application. I still didn't to the getLoan String, which I'll do later.
}
