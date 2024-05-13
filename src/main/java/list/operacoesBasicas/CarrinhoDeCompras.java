package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        itens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item item : itens) {
            valorTotal += (item.getPreco() * item.getQuantidade());
            }
        return valorTotal;
        }

    public void exibirItens() {
        System.out.println(itens);
    }

    public static void main(String[] args) {
         CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

         //carrinhoDeCompras.exibirItens();
         carrinhoDeCompras.adicionarItem("arroz",10.00,5);
        carrinhoDeCompras.adicionarItem("arroz",10.00,5);
        carrinhoDeCompras.adicionarItem("feijao",5.00,1);
        carrinhoDeCompras.adicionarItem("chocolate",5.00,1);
        //carrinhoDeCompras.exibirItens();
        System.out.printf("total do carrinho %.2f. \n",carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Arroz");
        carrinhoDeCompras.exibirItens();
        System.out.printf("total do carrinho %.2f. \n",carrinhoDeCompras.calcularValorTotal());

    }

}
