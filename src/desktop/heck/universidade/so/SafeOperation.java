package desktop.heck.universidade.so;

public class SafeOperation {
    public static void main(String[] args) {

        SafeDepositador d1 = new SafeDepositador();
        SafeDepositador d2 = new SafeDepositador();
        SafeDepositador d3 = new SafeDepositador();
        SafeDepositador d4 = new SafeDepositador();
        SafeDepositador d5 = new SafeDepositador();

        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();

        try {
            d1.join();
            d2.join();
            d3.join();
            d4.join();
            d5.join();

        } catch (InterruptedException e) {
            System.out.println("Oops, something get wrong...");
        }

        System.out.println("Operações seguras:");
        System.out.println("Saldo final: " + SafeDepositador.balance);
        System.out.println("Total de transações: " + SafeDepositador.totalTransactions);

    }

}
