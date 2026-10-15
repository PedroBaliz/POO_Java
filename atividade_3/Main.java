
public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Teclado", 150.00);

        produto.exibirResumo();

        produto.adicionarEstoque(10);
        produto.vender(3);

        produto.adicionarEstoque(0);
        produto.vender(0);

        produto.adicionarEstoque(-5);
        produto.vender(-2);

        produto.vender(20);

        produto.vender(7);

        produto.setNome("Teclado Gamer");
        produto.setPreco(199.90);

        produto.exibirResumo();
    }
}
