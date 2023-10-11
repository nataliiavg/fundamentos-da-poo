package construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        // criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("241515", "Marcos");

        // definimos o endereço de marcos
        marcos.setEndereco("Rua das Flores");

        // e como definir o nome e cpf de marcos?

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
