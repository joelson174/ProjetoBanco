package modelo;

public class ContaCorrente extends Conta {
	private double valorManutencao;

	public double getValorManutencao() {
		return valorManutencao;
	}

	public ContaCorrente() {
		super();
		this.setValorManutencao(0);
	}

	public ContaCorrente(String codigo, double saldo, String dataAbert, double valorManutencao) {
		super(codigo, saldo, dataAbert);
		this.setValorManutencao(valorManutencao);
	}

	public void efetuarManutencao() {
		this.setSaldo(this.getSaldo() - this.valorManutencao);
		System.out.println("Manutenção efetuada com sucesso (Valor: R$ " + valorManutencao + ")");
		this.adicionarHistorico(valorManutencao, "Manutenção", "DD/MM/AAAA");
	}

	public void setValorManutencao(double valorManutencao) {
		this.valorManutencao = valorManutencao;
	}
}
