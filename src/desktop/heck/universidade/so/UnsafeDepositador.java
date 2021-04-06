package desktop.heck.universidade.so;

public class UnsafeDepositador extends Thread{
    public static int balance = 0;
    public static int transactions=1000;
    public static int totalTransactions = 0;


    public UnsafeDepositador(){
        balance = 0;
    }

    public static void unsafeIncrement(){
        balance++;
        totalTransactions++;
    }

    @Override
    public void run() {
        for (int i=0; i<transactions; i++){
            unsafeIncrement();
        }
    }
}
