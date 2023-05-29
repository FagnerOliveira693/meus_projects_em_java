package bancoByteBank;

public class TestarValores {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.setAgencia(-307);
		minhaConta.setNumero(-38753);
		System.out.println(minhaConta.getAgencia());
		System.out.println(minhaConta.getNumero());
	}
}
