package modelo;

public class ContaCorrente extends Conta {
	private double valorManutencao;
	private boolean ativo;

	public double getValorManutencao() {
		return valorManutencao;
	}

	public ContaCorrente() {
		super();
		this.setValorManutencao(0);
		this.setAtivo(true);
	}

	public ContaCorrente(String codigo, double saldo, String dataAbert, double valorManutencao) {
		super(codigo, saldo, dataAbert);
		this.setValorManutencao(valorManutencao);
		this.setAtivo(true);
	}

	public void efetuarManutencao() {
		this.setSaldo(this.getSaldo() - this.valorManutencao);
		System.out.println("Manutenção efetuada com sucesso (Valor: R$ " + valorManutencao + ")");
		this.adicionarHistorico(valorManutencao, "Manutenção", "DD/MM/AAAA");
	}

	public void setValorManutencao(double valorManutencao) {
		this.valorManutencao = valorManutencao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
