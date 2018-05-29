package modelo;

public class ContaPoupanca extends Conta {
	private String dataAniver;
	private double jurosRend;
	private boolean ativo;

	public ContaPoupanca() {
		super();
		this.setDataAniver("");
		this.setJurosRend(0);
		this.setAtivo(true);
	}

	public ContaPoupanca(String codigo, double saldo, String dataAbert, String dataAniver, double jurosRend) {
		super(codigo, saldo, dataAbert);
		this.setDataAniver(dataAniver);
		this.setJurosRend(jurosRend);
		this.setAtivo(true);
	}

	public void efetuarRendimento() {
		this.setSaldo(getSaldo() + (getSaldo() * jurosRend));
		this.adicionarHistorico(getSaldo(), "Rendimento", "DD/MM/AAAA");
	}

	public String getDataAniver() {
		return dataAniver;
	}

	public void setDataAniver(String dataAniver) {
		this.dataAniver = dataAniver;
	}

	public double getJurosRend() {
		return jurosRend;
	}

	public void setJurosRend(double jurosRend) {
		this.jurosRend = jurosRend;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
