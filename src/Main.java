
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(2334534,18,"Vitor");
        Pessoa pessoa2 = new Pessoa(23234232, 24, "Vitor");
        System.out.println("O endereço de memória da pessoa1 é: " + System.identityHashCode(pessoa1));
        System.out.println("O hash do endereço da pessoa 1 é: " + pessoa1.HashCode());
        System.out.println("O endereço de memória da pessoa2 é: " + System.identityHashCode(pessoa2));
        System.out.println("O hash do endereço da pessoa 2 é: " + pessoa2.HashCode());
    }
}
