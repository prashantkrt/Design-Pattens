package behavioral_design_pattern.Template_design_pattern.example2;

import java.math.BigDecimal;

public class WithdrawTransaction extends BankTransaction{
    private Account account;
    private BigDecimal amount;

    public WithdrawTransaction(Account account, BigDecimal amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    protected void validateInputs() {
        System.out.println("Validating withdrawal inputs...");
        // Validate withdrawal inputs
    }

    @Override
    protected void performTransaction() {
        System.out.println("Performing withdrawal transaction...");
        // Perform withdrawal transaction
        account.withdraw(amount);
    }
}
