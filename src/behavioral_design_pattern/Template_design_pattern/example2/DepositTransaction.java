package behavioral_design_pattern.Template_design_pattern.example2;

import java.math.BigDecimal;

public class DepositTransaction extends BankTransaction{

    private Account account;
    private BigDecimal amount;

    public DepositTransaction(Account account, BigDecimal amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    protected void validateInputs() {
        System.out.println("Validating deposit inputs...");
        // Validate deposit inputs
    }

    @Override
    protected void performTransaction() {
        System.out.println("Performing deposit transaction...");
        // Perform deposit transaction
        account.deposit(amount);
    }
}
