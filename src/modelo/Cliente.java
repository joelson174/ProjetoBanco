package modelo;

public class Cliente {
	private String nome;
	private String cpf;
	private String dataNasc;
	private String endereco;
	private String fone;
	private ContaCorrente contC;
	private ContaPoupanca contP;

	public Cliente() {

	}

	public Cliente(String nome, String cpf, String dataNasc, String endereco, String fone) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNasc(dataNasc);
		this.setEndereco(endereco);
		this.setFone(fone);
	}

	public Cliente(String nome, String cpf, String dataNasc, String endereco, String fone, ContaCorrente contC) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNasc(dataNasc);
		this.setEndereco(endereco);
		this.setFone(fone);
		this.setContC(contC);
		this.setContP(null);
	}

	public Cliente(String nome, String cpf, String dataNasc, String endereco, String fone, ContaPoupanca contP) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNasc(dataNasc);
		this.setEndereco(endereco);
		this.setFone(fone);
		this.setContC(null);
		this.setContP(contP);
	}

	public Cliente(String nome, String cpf, String dataNasc, String endereco, String fone, ContaCorrente contC,
			ContaPoupanca contP) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNasc(dataNasc);
		this.setEndereco(endereco);
		this.setFone(fone);
		this.setContC(contC);
		this.setContP(contP);
	}

	public void mostrarDadosCliente() {
		System.out.println("======Dados do Cliente======");
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Data de Nascimento: " + this.getDataNasc());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getFone());
		System.out.println("==========Contas============");
		if (contC != null) {
			System.out.println("Conta Corrente: ");
			this.contC.mostrarDadosConta();
		} else {
			System.out.println("Conta corrente inexistente!");
			System.out.println("==========================");
		}
		if (contP != null) {
			System.out.println("Conta poupança: ");
			this.contP.mostrarDadosConta();
		} else {
			System.out.println("Conta poupanca inexistente!");
			System.out.println("==========================");
		}
	}

	public void debitarCorrente(double obj) {
		if (contC != null) {
			this.getContC().sacar(obj);
		} else {
			System.out.println("Conta corrente inexistente para débito!");
		}
	}

	public void debitarPoupanca(double obj) {
		if (contP != null) {
			this.getContP().sacar(obj);
		} else {
			System.out.println("Conta poupança inexistente para débito!");
		}
	}

	public void creditarCorrente(double obj) {
		if (contC != null) {
			this.getContC().depositar(obj);
		} else {
			System.out.println("Conta corrente inexistente para crédito!");
		}
	}

	public void creditarPoupanca(double obj) {
		if (contP != null) {
			this.getContP().depositar(obj);
		} else {
			System.out.println("Conta poupança inexistente para crédito!");
		}
	}

	public void transferirCorrente(double obj, String dest) {
		if (contC != null) {
			this.getContC().transferir(obj, dest);
		} else {
			System.out.println("Conta corrente inexistente para transferência!");
		}
	}

	public void transferirPoupanca(double obj, String dest) {
		if (contP != null) {
			this.getContP().transferir(obj, dest);
		} else {
			System.out.println("Conta poupança inexistente para transferência!");
		}
	}
	
	public void mostrarHistoricoCorrente(){
		if (contC != null){
			this.getContC().mostrarHistoricoConta();
		} else{
			System.out.println("Conta corrente inexistente para mostrar histórico!");
		}
	}
	
	public void mostrarHistoricoPoupanca(){
		if (contP != null){
			this.getContP().mostrarHistoricoConta();
		} else{
			System.out.println("Conta poupanca inexistente para mostrar histórico!");
		}
	}
	
	public void calcularRendimentoPoupanca(){
		if (contP != null){
			this.getContP().efetuarRendimento();
		} else {
			System.out.println("Conta poupanca inexistente para efetuar rendimento!");
		}
	}
	
	public void calcularValorManutencao(){
		if (contC != null){
			this.getContC().efetuarManutencao();
		} else {
			System.out.println("Conta corrente inexistente para efetuar manutenção!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public ContaCorrente getContC() {
		return contC;
	}

	public void setContC(ContaCorrente contC) {
		this.contC = contC;
	}

	public ContaPoupanca getContP() {
		return contP;
	}

	public void setContP(ContaPoupanca contP) {
		this.contP = contP;
	}

}
