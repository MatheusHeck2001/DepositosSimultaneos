package desktop.heck.universidade.so;

public class UnsafeOperation extends Thread {

    public static void main(String[] args) {
        UnsafeDepositador d1 = new UnsafeDepositador();
        UnsafeDepositador d2 = new UnsafeDepositador();
        UnsafeDepositador d3 = new UnsafeDepositador();
        UnsafeDepositador d4 = new UnsafeDepositador();
        UnsafeDepositador d5 = new UnsafeDepositador();

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

        } catch (InterruptedException e){
            System.out.println("Oops, something get wrong...");
        }

        System.out.println("Operações inseguras:");
        System.out.println("Saldo final: " + UnsafeDepositador.balance);
        System.out.println("Total de transações: " + UnsafeDepositador.totalTransactions);
    }

}
