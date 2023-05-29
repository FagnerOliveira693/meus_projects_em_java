package nossoSuperBancoDigital;

public class FuncionarioTeste {

	private String nome;
	private String cpf;
	private double salario;
	private int ra;
	private String rg;
	private int matricula;
	private int tipo = 0; //0 = Funcionário comum; 1 = Gerente; 2 = Diretor
	
	
	
	
	
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double getBonificacao() {
		if (this.tipo == 0) {
			return this.salario * 0.1;
		} else if (this.tipo == 1) {
			return this.salario;
		} else {
			return this.salario + 1000;
		}
		
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}
	
}
