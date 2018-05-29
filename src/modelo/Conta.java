package modelo;

import java.util.ArrayList;

public abstract class Conta {
	private String codigo;
	private double saldo;
	private String dataAbert;
	private ArrayList<Historico> historico;

	public Conta() {
		this.historico = new ArrayList<Historico>();
		this.setCodigo("");
		this.setSaldo(0);
		this.setDataAbert("");
	}

	public Conta(String codigo, double saldo, String dataAbert) {
		this.historico = new ArrayList<Historico>();
		this.setCodigo(codigo);
		this.setSaldo(saldo);
		this.setDataAbert(dataAbert);
	}

	public void mostrarDadosConta() {
		System.out.println("Codigo da conta: " + this.getCodigo());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data de abertura: " + this.getDataAbert());
		System.out.println("===========================");
	}

	public double sacar(double obj) {
		if (this.getSaldo() >= obj) {
			this.setSaldo(this.getSaldo() - obj);
			System.out.println("Valor sacado com sucesso (R$ " + obj + ")");
			this.historico.add(new Historico(obj, "Saque", "DD/MM/AAAA"));
			return getSaldo();
		} else {
			System.out.println("Dinheiro insuficiente para saque!");
			return getSaldo();
		}
	}

	public double depositar(double obj) {
		this.setSaldo(this.getSaldo() + obj);
		System.out.println("Valor depositado com sucesso (R$ " + obj + ")");
		this.historico.add(new Historico(obj, "Depósito", "DD/MM/AAAA"));
		return getSaldo();
	}

	public double transferir(double obj, String dest) {
		if (this.getSaldo() >= obj) {
			this.setSaldo(this.getSaldo() - obj);
			System.out.println("Valor transferido com sucesso (R$ " + obj + ") para a conta " + dest);
			this.historico.add(new Historico(obj, "Transferencia", "DD/MM/AAAA", dest));
			return getSaldo();
		} else {
			System.out.println("Dinheiro insuficiente para transferencia!");
			return getSaldo();
		}
	}

	public void mostrarHistoricoConta() {
		for (int i = 0; i < this.historico.size(); i++) {
			System.out.println("Registro " + i + ": ");
			this.historico.get(i).mostrarDadosHistorico();
		}
	}

	public void adicionarHistorico(double value, String type, String date) {
		this.historico.add(new Historico(value, type, date));
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getDataAbert() {
		return dataAbert;
	}

	public void setDataAbert(String dataAbert) {
		this.dataAbert = dataAbert;
	}

	public ArrayList<Historico> getHistorico() {
		return historico;
	}

	public void setHistorico(ArrayList<Historico> historico) {
		this.historico = historico;
	}

}
