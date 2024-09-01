package POOex01;

public class Main {
    public static void main(String[] args) {

        Caneta c1= new Caneta();
        c1.marca= "Bic";
        c1.cor= "Azul";
        c1.ponta= 0.5;

        c1.Tampada();
        c1.rabiscar();
        System.out.println("-------------------");
        c1.Status();
        System.out.println("-------------------");


        Caneta c2 = new Caneta();
        c2.marca= "Castel";
        c2.cor= "Preta";
        c2.ponta= 0.3;

        c2.Destampada();
        c2.rabiscar();
        System.out.println("-------------------");
        c2.Status();
        System.out.println("-------------------");


    }
}
