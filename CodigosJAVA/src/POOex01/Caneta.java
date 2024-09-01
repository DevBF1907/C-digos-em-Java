package POOex01;

public class Caneta {
    String cor, marca;
    double ponta;
    boolean tampa;

      void Status(){
        System.out.println("Modelo: "+ this.marca );
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Tampada: "+ this.tampa );
    }
        void Tampada(){
          this.tampa = true;
        }
        void Destampada(){
          this.tampa = false;
        }
        void rabiscar(){
          if(this.tampa==true){
              System.out.println("ERRO!!  Caneta tampada");
          }else{
              System.out.println("Rabiscando...");
          }
        }
}
