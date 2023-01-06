import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, BankAccount> bankAccounts = new HashMap<>();
        String input = scanner.nextLine();

        while (!input.contains("End")){
            if (input.contains("Create")){
                BankAccount bankAccount = new BankAccount();
                bankAccounts.put(bankAccount.getId(), bankAccount);
                System.out.println("Account ID" + bankAccount.getId() + " created");
            } else if (input.contains("Deposit")){
                String[] lines = input.split(" ");
                if (!checkIfBankAccountExists(bankAccounts, Integer.parseInt(lines[1]))){
                    System.out.println("Account does not exist");
                } else {
                    System.out.println(addDeposit(bankAccounts, lines));
                }
            } else if (input.contains("SetInterest")){
                BankAccount bankAccount = new BankAccount();
                String[] lines = input.split(" ");
                bankAccount.setInterestRate(Double.parseDouble(lines[1]));
            } else if (input.contains("GetInterest")){
                String[] lines = input.split(" ");
                if (!checkIfBankAccountExists(bankAccounts, Integer.parseInt(lines[1]))){
                    System.out.println("Account does not exist");
                } else {
                    System.out.println(getInterest(bankAccounts, lines));
                }
            }
            input = scanner.nextLine();
        }
        scanner.close();
    }

    public static String addDeposit(Map<Integer, BankAccount> bankAccounts, String[] lines){
        int bankAccountId = Integer.parseInt(lines[1]);
        double amount = Double.parseDouble(lines[2]);
        bankAccounts.get(bankAccountId).deposit(amount);
        return "Deposited " + amount + " to ID" + bankAccountId;
    }

    public static boolean checkIfBankAccountExists(Map<Integer, BankAccount> bankAccounts, int bankAccountId){
        if (!bankAccounts.containsKey(bankAccountId)){
            return false;
        }
        return true;
    }

    // 20.00
    public static double getInterest(Map<Integer, BankAccount> bankAccounts, String[] lines){
        return bankAccounts.get(Integer.parseInt(lines[1])).getInterest(Integer.parseInt(lines[2]));
    }

}