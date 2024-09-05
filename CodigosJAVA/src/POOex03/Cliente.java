package POOex03;

public class Cliente {    private String nome;
    private double renda;
    private String cpf;
    private String endereco;
    private String dataNascimento;
    private char sexo;
    private String celular;
    private String telefoneResidencial;
    private String email;

    public double getRenda() {return renda;}

    public void setRenda(double renda) {
        if(renda>=0) {
            this.renda = renda;
        }else{
            System.out.println("A renda não pode ser negativa");
        }
        }
    }

