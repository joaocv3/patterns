package proj.arq.model;

public class CarrinhoMestre extends Observable {

    private static CarrinhoMestre uniqueInstance;
    private List<Produto> produtos;

    private CarrinhoMestre() {
        produtos = new ArrayList();
    }

    public static synchronized CarrinhoMestre getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new CarrinhoMestre();
        }

        return uniqueInstance;
    }

    public static void comprar(Carrinho carrinho) {
        produtos.addAll(carrinho.getProdutos())
    }
}