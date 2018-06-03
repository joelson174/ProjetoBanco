package execucao;

import modelo.Cliente;
import modelo.ContaPoupanca;

public class Execucao {
	public static void main(String[] args) {
		ContaPoupanca cPoup = new ContaPoupanca("9182098", 200, "23/02/2000", "23/02", 0.10);
		Cliente cli1 = new Cliente("José", "123.123.123-12", "12/03/1985", "Rua 1", "1234-1234", cPoup);

		cli1.mostrarDadosCliente();

		cli1.creditarPoupanca(1000);
		cli1.debitarPoupanca(1.99);
		cli1.transferirPoupanca(0.30, "Nubank");
		cli1.calcularRendimentoPoupanca();
		cli1.mostrarHistoricoPoupanca();
	}
}
