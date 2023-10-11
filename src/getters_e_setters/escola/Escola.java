package getters_e_setters.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Jorge Lucas");
        felipe.setIdade(12);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");

    }
}
