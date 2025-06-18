public class Pessoa {
    private int Cpf;
    private int Idade;
    private String Nome;
    public Pessoa(int Cpf, int Idade, String Nome){
        this.Cpf=Cpf;
        this.Idade=Idade;
        this.Nome=Nome;

    }
    public int HashCode(){
        return Cpf;
    }

}
