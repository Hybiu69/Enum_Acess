package poo.modificadores;

public class Endereco {
	
	private String rua,bairro,cep;
	private int numero;
	private Cidade cidade;


	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade=cidade;
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua=rua;
	}

	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro=bairro;
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep=cep;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero=numero;
	}

}