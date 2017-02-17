public class Pessoa {
	private String nome;
	private int idade;
	private double saldo;

	public Pessoa(String nome, int idade, double saldo) {
		this.nome = nome;
		this.idade = idade;
		this.saldo = saldo;
	}

	public String getNome(){
		return nome;
	}

	public String getIdade(){
		return idade;
	}
	public String getSaldo(){
		return saldo;
	}

	

}
