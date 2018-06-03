package modelo;

public class Historico {
	private double valor;
	private String tipo;
	private String data;
	private String destino;

	public Historico() {

	}

	public Historico(double valor, String tipo, String data, String destino) {
		this.setValor(valor);
		this.setTipo(tipo);
		this.setData(data);
		this.setDestino(destino);
	}

	public Historico(double valor, String tipo, String data) {
		this.setValor(valor);
		this.setTipo(tipo);
		this.setData(data);
	}

	public void mostrarDadosHistorico() {
		if (this.getDestino() != null) {
			System.out.println("============================");
			System.out.println("Valor: R$ " + this.getValor());
			System.out.println("Tipo da conta: " + this.getTipo());
			System.out.println("Data da atividade: " + this.getData());
			System.out.println("Destino: " + this.getDestino());
			System.out.println("============================");
		} else {
			System.out.println("============================");
			System.out.println("Valor: R$ " + this.getValor());
			System.out.println("Tipo da conta: " + this.getTipo());
			System.out.println("Data da atividade: " + this.getData());
			System.out.println("============================");
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

}
