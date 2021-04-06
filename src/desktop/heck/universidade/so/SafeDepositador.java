package desktop.heck.universidade.so;

public class SafeDepositador extends Thread{
    public static int balance = 0;
    public static int transactions = 1000;
    public static int totalTransactions = 0;


    public SafeDepositador(){
        balance = 0;
    }

    public static synchronized void safeIncrement(){
        balance++;
        totalTransactions++;
    }

    @Override
    public void run() {
        for (int i=0; i<transactions; i++){
            safeIncrement();
        }
    }
}
