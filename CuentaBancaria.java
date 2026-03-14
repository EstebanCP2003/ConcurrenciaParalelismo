package Hilos;

class Banco{

    private int saldo = 1000;

    public synchronized void retirar(String cliente, int monto){
        System.out.println(cliente + " intenta retirar $" + monto);

        if (saldo >=monto){
            System.out.println("Estimado " + cliente + " se está realizando el retiro...");
            saldo -= monto;
            System.out.println(cliente + " retiraste $" + monto + ".\n" + "Saldo Actual: $" + saldo);
        }

        else {
            System.out.println("Estimado " + cliente + " no se puedo realizar el retiro.\nSaldo insuficiente: $" + saldo);
        }
    }
}

class Cliente implements Runnable{

    private Banco cuentabancaria;
    private String nombre;

    public Cliente(Banco cuentabancaria, String nombre){
        this.cuentabancaria = cuentabancaria;
        this.nombre = nombre;
    }

    @Override
    public void run(){
        cuentabancaria.retirar(nombre, 400);
    }
}

public class CuentaBancaria {
    public static void main(String[] args) {

        Banco cuenta = new Banco();

        Thread Usuario1 = new Thread(new Cliente(cuenta, "Juan Esteban"));
        Thread Usuario2 = new Thread(new Cliente(cuenta, "Sergio Andres Cachaya"));
        Thread Usuario3 = new Thread(new Cliente(cuenta, "Valentina Bermeo"));

        Usuario1.start();
        Usuario2.start();
        Usuario3.start();
    }
}
