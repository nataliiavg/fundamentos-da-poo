package enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro uf : EstadoBrasileiro.values()) {
            System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
        }

        // selecionando um estado a partir das opções disponiveis
        EstadoBrasileiro eb = EstadoBrasileiro.CEARA;

        System.out.println("O Estado selecionado foi: " + eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());



    }
}
