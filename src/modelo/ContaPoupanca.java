package modelo;

public class ContaPoupanca extends Conta {
	private String dataAniver;
	private double jurosRend;

	public ContaPoupanca() {
		super();
		this.setDataAniver("");
		this.setJurosRend(0);
	}

	public ContaPoupanca(String codigo, double saldo, String dataAbert, String dataAniver, double jurosRend) {
		super(codigo, saldo, dataAbert);
		this.setDataAniver(dataAniver);
		this.setJurosRend(jurosRend);
	}

	public void efetuarRendimento() {
		this.setSaldo(getSaldo() + (getSaldo() * jurosRend));
		System.out.println("Rendimento efetuado com sucesso! (" + jurosRend + " do total)");
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
}
