package bancoByteBank;

public class TestarGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		Cliente cliente = new Cliente();
		
		conta.setNumero(1337);
		System.out.println(conta.getSaldo());
		System.out.println(conta.getNumero());
		
		conta.setAgencia(3196);
		System.out.println(conta.getAgencia());
		cliente.setNome("Fagner Araujo");
		conta.setTitular(cliente);
		
		//System.out.println(conta.getTitular().getNome());
		//cliente.setCpf("225.225.225-25");
		//conta.setTitular(cliente);
		cliente.setDataDeNascimento("28/03/2015");
		conta.setTitular(cliente);
		
		//System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular().getDataDeNascimento());
		cliente.setProfissao("Programadora de sistemas");
		conta.setTitular(cliente);
		
		System.out.println(conta.getTitular().getProfissao());
	}
}
