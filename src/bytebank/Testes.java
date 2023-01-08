package bytebank;

public class Testes{

	public static void main(String[] args) {
		Conta conta = new Conta(01, 1006);
		
		
		conta.setAgencia(1);
		System.out.println("Agência: " + conta.getAgencia());
		
		conta.setNumero(1002);
		System.out.println("Número: " + conta.getNumero());
		
		Cliente Lais = new Cliente();
		
		conta.titular = Lais;
		
		Lais.setNome("Lais Ribeiro da Silva");
		System.out.println("Nome: " + Lais.getNome());
		
		System.out.println(conta.getTitular().getNome());
		
		Lais.setCpf("1731361937");
		System.out.println("CPF: " + Lais.getCpf());
		
		Lais.setProfissao("Programadora");
		System.out.println("Profissão: " + Lais.getProfissao());
	}

}
