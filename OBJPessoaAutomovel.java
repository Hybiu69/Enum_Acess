package poo.modificadores;

import java.util.Scanner;

public class OBJPessoaAutomovel {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		Pessoa pessoa = new Pessoa ();

		String cor,nome;
		int velocidade;

		System.out.println("Informe a cor do carro");
		cor=l.next();

		System.out.println("Informe o nome do carro");
		nome=l.next();

		System.out.println("Informe a velocidade do carro");
		velocidade=l.nextInt();

		pessoa.compracarro(cor, nome, velocidade);
		Automovel carro = pessoa.getAutomovel();

		System.out.println("O carro comprado foi "+carro.getNome()+"da cor "+carro.getCor()+"que atinge a velocidade de "+carro.getVelocidade()+"KM/h");



		l.close();
	}

}