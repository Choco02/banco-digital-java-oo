import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("John Smith");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(50);

		boolean a = true;
		Scanner escolher = new Scanner(System.in);
		while (a) {
			// System.out.println(opcaoEscolhida);
			

			System.out.println(
				"Escolha uma operação para fazer (Escolha a letra correspondente) :\n"+
				"1.Depositar\n"+
				"2.Sacar\n"+
				"3.Ver seu extrato\n"+
				"4.Transferir\n\n"+
				"5.Sair\n"
			);

			byte opcaoEscolhida = escolher.nextByte();

			// escolher.close();
			if (opcaoEscolhida == 5) break;

			if (opcaoEscolhida == 1) {
				System.out.println("Quanto você quer depositar\n\n");
				Scanner deposito = new Scanner(System.in);
				double valor = deposito.nextDouble();
				cc.depositar(valor);
				System.out.printf("Você depositou com sucesso %.2f\n\n", valor);
				// deposito.close();
			}
			else if (opcaoEscolhida == 2) {
				System.out.println("Quanto você quer sacar?\n\n");
				Scanner saque = new Scanner(System.in);
				double valor = saque.nextDouble();

				boolean sucesso = cc.sacar(valor);

				if (sucesso) System.out.println("Você realizou o saque com sucesso\n\n");

				// saque.close();
			}
			else if (opcaoEscolhida == 3) {
				cc.imprimirExtrato();
			}
			else if (opcaoEscolhida == 4) {
				System.out.println("Função em manutenção\n\n");
				// Implementar
				// cc.transferir(valor, contaDestino);
			}
		}

		escolher.close();
	}

}
