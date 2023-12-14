public class Account {
    private double value;
    private String name;

    Account(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String toString() {
        return "Account: " + name + " contains " + value + "chf";
    }

    public static void testAccount() {
        Account[] accounts = new Account[2];
        accounts[0] = new Account("Petra", 111);
        accounts[1] = new Account("Klaus", 999);
        for (int i = 0; i < accounts.length; ++i) {
            ;
            System.out.print("account " + i + ": ");
            System.out.println(accounts[i]);
        }
    }

    public static void main(String[] args) {
        testAccount();
    }
}
