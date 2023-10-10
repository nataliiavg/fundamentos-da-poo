package visibilidade_dos_recursos.lanchonete;

import visibilidade_dos_recursos.lanchonete.area.cliente.Cliente;
import visibilidade_dos_recursos.lanchonete.atendimento.Atendente;
import visibilidade_dos_recursos.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();

		// ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		Atendente atendente = new Atendente();
		atendente.receberPagamento();
		atendente.servindoMesa();

		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();

	}
}