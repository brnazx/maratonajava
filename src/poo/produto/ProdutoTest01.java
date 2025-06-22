package poo.produto;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        produto.setNome("TV");
        produto.setPreco(2989.90);

        System.out.println(produto.getNome() + " - R$ " + produto.getPreco());

        System.out.print("\nQuantidade para adicionar ao estoque: ");
        produto.adicionarEstoque(sc.nextInt());

        produto.exibirInformacoes(produto.getNome(), produto.getPreco(), produto.getQuantidade());

        System.out.print("Quantidade para remover do estoque: ");
        produto.removerEstoque(sc.nextInt());

        produto.exibirInformacoes(produto.getNome(), produto.getPreco(), produto.getQuantidade());

        sc.close();
    }
}
