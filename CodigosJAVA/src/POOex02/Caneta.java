package POOex02;

public class Caneta {
    private String cor, marca;
    private double ponta;
    private boolean tampa;

    // construtor
    Caneta(String cor, String marca, double ponta){
        this.cor= cor;
        this.marca= marca;
        this.ponta= ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

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

