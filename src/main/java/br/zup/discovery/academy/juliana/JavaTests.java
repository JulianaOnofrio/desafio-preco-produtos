package br.zup.discovery.academy.juliana;
import java.util.Arrays;
import java.util.List;

public class JavaTests {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.preco = 10;

        Produto p2 = new Produto();
        p2.preco = 30;

        List<Produto> produtos = Arrays.asList(p1, p2);
        //é um stream que vai percorrer e vai retornar a soma dos produtos, porque o map faz uma operação em cima de inteiros..
        Integer somaPrecoProdutos = produtos.stream().mapToInt(p -> p.preco).sum();

        System.out.println(somaPrecoProdutos);

    }

    static class Produto {
        Integer preco;
    }
}
