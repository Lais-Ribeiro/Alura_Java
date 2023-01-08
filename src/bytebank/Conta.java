package bytebank;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero; 
	Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero){
        Conta.total ++;
        System.out.println("O total de contas é " + total);
		this.numero = numero;
		this.agencia = agencia;
		System.out.println("Conta criada com sucesso!! Conta: " + this.numero +
				" Agencia: " + this.agencia);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Numero de conta inválido!");
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Número de agência inválido!");
			return;
		}
		this.agencia = agencia;
	}
	
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() { 
	    return Conta.total; 
	}
}
