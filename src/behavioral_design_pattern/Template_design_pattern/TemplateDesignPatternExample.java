package behavioral_design_pattern.Template_design_pattern;

public class TemplateDesignPatternExample {
    public static void main(String[] args) {
        PaymentFlow payToFriend = new PayToFriend();
        payToFriend.sendMoney();

        PaymentFlow payToMerchantFlow = new PayToMerchantFlow();
        payToMerchantFlow.sendMoney();
    }
}
