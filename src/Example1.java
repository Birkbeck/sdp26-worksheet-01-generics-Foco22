public class Example1 {
    public static void main(String... args) {

        Storage<BankAccount> bankAccountStorage = new Storage<BankAccount>();
        Storage<String> stringStorage = new Storage<String>();

        BankAccount account = new BankAccount(2025);
        bankAccountStorage.setItem(account);

        BankAccount account1 = bankAccountStorage.getItem();
        account1.deposit(15);

        System.out.println("Account " + account1.getAccountNumber());
    }
}
