public class Example1 {
    public static void main(String... args) {

        var bankAccountStorage = new Storage<>();
        var stringStorage = new Storage<>();

        BankAccount account = new BankAccount(2025);
        bankAccountStorage.setItem(account);

        Object account1 = bankAccountStorage.getItem();
        account1.deposit(15);
    }
}
