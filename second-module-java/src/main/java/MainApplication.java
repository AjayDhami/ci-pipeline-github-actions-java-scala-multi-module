public class MainApplication {

    public static void main(String[] args) {
        System.out.println("Testing CI pipeline Github Actions for Second-Module");
        System.out.println("Profit: " + Account.profit(20, 10));
        System.out.println("Loss: " + Account.loss(20, 10));
        System.out.println("Turnover: " + Account.turnOver(20, 10));
    }
}
