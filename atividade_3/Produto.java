
public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            System.out.println("Estoque adicionado com sucesso!");
        } else {
            System.out.println("A quantidade deve ser maior que zero.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade para venda deve ser maior que zero.");
        } else if (quantidade > quantidadeEmEstoque) {
            System.out.println("Estoque insuficiente para a venda.");
        } else {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Venda realizada com sucesso!");
        }
    }

    public void exibirResumo() {
        System.out.println("\n--- Resumo do Produto ---");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }
}
