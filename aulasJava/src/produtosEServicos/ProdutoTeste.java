package produtosEServicos;

public class ProdutoTeste {
	public static void main(String[] args) {
		ClasseProdutos p1 = new ClasseProdutos();
		p1.nome = "Computador";
		p1.preco = 5500;
		p1.desconto = 0.3;
		
		double precoFinal = p1.preco *(1 - p1.desconto);
		System.out.printf("O preço final, é = R$%.2f: ", precoFinal);
	}

}
