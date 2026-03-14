package Hilos;

class Sumar implements Runnable{

    private int inicio;
    private int finalizar;
    private long sumatoria;

    //Método constructor
    public Sumar(int inicio, int finalizar){
        this.inicio = inicio;
        this.finalizar = finalizar;
        this.sumatoria = 0;
    }

    //Retornamos el valor de sumatoria
    public long GetSumatoria(){
        return sumatoria;
    }

    @Override
    public void run(){
        for (int i = inicio; i <= finalizar; i++){
            sumatoria += i;
        }

        System.out.printf("\nSuma de inicio: " + inicio + ", hasta: " + finalizar + " = " + sumatoria);
    }
}

public class ConcurrenciaParalelismo{

    public static void main(String[] args) {

        Sumar recorrer1 = new Sumar(1, 250000);
        Sumar recorrer2 = new Sumar(250001, 500000);
        Sumar recorrer3 = new Sumar(500001, 750000);
        Sumar recorrer4 = new Sumar(750001, 1000000);

        Thread h1 = new Thread(recorrer1);
        Thread h2 = new Thread(recorrer2);
        Thread h3 = new Thread(recorrer3);
        Thread h4 = new Thread(recorrer4);

        h1.start();
        h2.start();
        h3.start();
        h4.start();

        try{
            h1.join();
            h2.join();
            h3.join();
            h4.join();
        }

        catch (InterruptedException e){
            System.out.println(e);
        }

        long SumatoriaTotal = recorrer1.GetSumatoria() + recorrer2.GetSumatoria() + recorrer3.GetSumatoria() + recorrer4.GetSumatoria();

        System.out.println("\nSuma total: " + SumatoriaTotal);
    }
}
