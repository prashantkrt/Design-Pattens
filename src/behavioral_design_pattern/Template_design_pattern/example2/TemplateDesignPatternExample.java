package behavioral_design_pattern.Template_design_pattern.example2;

import java.math.BigDecimal;

public class TemplateDesignPatternExample {
    public static void main(String[] args) {
        Account account = new Account("1234567890", new BigDecimal("1000.00"));

        BankTransaction deposit = new DepositTransaction(account, new BigDecimal("500.00"));
        deposit.execute();
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());

        BankTransaction withdraw = new WithdrawTransaction(account, new BigDecimal("200.00"));
        withdraw.execute();
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
    }
}
