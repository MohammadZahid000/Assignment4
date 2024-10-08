package Assignment4;
public class SavingsAccountTest {
    public static void main(String[] args) {
        
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

       
        SavingsAccount.modifyInterestRate(0.03);

       
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Saver 1's new balance after 3%% interest: $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2's new balance after 3%% interest: $%.2f\n", saver2.getSavingsBalance());

        
        SavingsAccount.modifyInterestRate(0.04);

        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Saver 1's new balance after 4%% interest: $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2's new balance after 4%% interest: $%.2f\n", saver2.getSavingsBalance());
    }
}
