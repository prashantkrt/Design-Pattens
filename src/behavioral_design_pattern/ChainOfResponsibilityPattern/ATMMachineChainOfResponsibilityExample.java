package behavioral_design_pattern.ChainOfResponsibilityPattern;

import java.util.Scanner;

public class ATMMachineChainOfResponsibilityExample {

    DispenseChain dispenseChain;

    ATMMachineChainOfResponsibilityExample() {
        this.dispenseChain = new TwoThousand();
        DispenseChain dispenseChain500 = new FiveHundred();
        DispenseChain dispenseChain100 = new Hundred();
        DispenseChain dispenseChain50 = new Fifty();

        dispenseChain.chain(dispenseChain500);
        dispenseChain500.chain(dispenseChain100);
        dispenseChain100.chain(dispenseChain50);
    }

    public static void main(String[] args) {
        ATMMachineChainOfResponsibilityExample atm = new ATMMachineChainOfResponsibilityExample();
        System.out.println("Please enter the amount to withdraw");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        while (true) {
            if (amount % 50 != 0) {
                System.out.println("Please enter the amount in multiples of 50s");
                return;
            }
            atm.dispenseChain.dispense(new Currency(amount));
            System.out.println("Do you want to withdraw more !! enter 1 continue!!");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Please enter the amount to withdraw");
                amount = sc.nextDouble();
            } else {
                System.out.println("Glad to serve you !! do visit again");
                break;
            }
        }
    }
}
