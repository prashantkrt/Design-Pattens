package behavioral_design_pattern.Template_design_pattern.example2;

public abstract class BankTransaction {

    public final void execute() {
        authenticate();
        validateInputs();
        performTransaction();
        updateTransactionLog();
        notifyUser();
    }

    protected void authenticate() {
        System.out.println("Authenticating user...");
        // Authenticate user
    }

    protected abstract void validateInputs();

    protected abstract void performTransaction();

    protected void updateTransactionLog() {
        System.out.println("Updating transaction log...");
        // Log transaction details
    }

    protected void notifyUser() {
        System.out.println("Notifying user...");
        // Send notification to user
    }
}
