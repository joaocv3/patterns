package proj.arq.model;

public class CarrinhoMestre {

    private static CarrinhoMestre uniqueInstance;

    private CarrinhoMestre() {
    }

    public static synchronized CarrinhoMestre getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new CarrinhoMestre();
        }

        return uniqueInstance;
    }
}