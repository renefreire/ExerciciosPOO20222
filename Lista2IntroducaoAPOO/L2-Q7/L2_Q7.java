/*
Universidade Federal Fluminense
Centro Tecnológico
Instituto de Computação
Curso de Graduação em Ciência da Computação
Disciplina: TCC00328 - Programação Orientada a Objetos
Prof.: Vânia de Oliveira Neves
Turma: A1

Aluno: Rene Cruz Freire
Matrícula: 819031057
Email: renefreire@id.uff.br

2022/2
*/

/*
Lista de Exercícios 2
7 -  Identifique e implemente as classes em Java para a seguinte especificação:
O supermercado vende diferentes tipos de produtos. Cada produto tem um preço e
uma quantidade em estoque. Um pedido de um cliente é composto de itens, onde
cada item especifica o produto que o cliente deseja e a respectiva quantidade. 
Esse pedido pode ser pago em dinheiro, cheque ou cartão.
*/

import java.util.Scanner;

public class L2_Q7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pedido cliente = new Pedido();
        Pedido estoque = new Pedido();
        
        System.out.println("************Mercadão do Boaçu On-line************");
        estoque.criaEstoque();
        estoque.exibeEstoque();
        System.out.println("\nAdicione ao carrinho:");
        cliente.pegaCarrinho();
        System.out.print("\nID do produto (0 para sair) -> ");
        int id = Integer.parseInt(teclado.nextLine());
        while (id != 0){
            Produto novo = estoque.buscaProduto(id);
            if (novo != null){
                cliente.addItem(novo);
                System.out.print("\nID do produto (0 para sair) -> ");
            }
            else
                System.out.print("\nDigite um ID válido (0 para sair) -> ");
            id = Integer.parseInt(teclado.nextLine());
        }
        if (!cliente.carrinhoVazio()){
            System.out.print("\nDeseja retirar algum item do carrinho (S/N)?");
            System.out.print(" -> ");
            String flag = teclado.nextLine();
            if (flag.compareToIgnoreCase("S") == 0){
                System.out.print("\nID do produto a retirar (0 para sair) -> ");
                id = Integer.parseInt(teclado.nextLine());
                while (id != 0){
                    Produto fora = cliente.buscaProduto(id);
                    cliente.retiraItem(fora);
                    System.out.print("\nID do produto a retirar ");
                    System.out.print("(0 para sair) -> ");
                    id = Integer.parseInt(teclado.nextLine());
                }
            }
            if (!cliente.carrinhoVazio()){
                System.out.println("\nSeu Carrinho:");
                cliente.mostraCarrinho();
                System.out.printf("TOTAL = R$%.2f\n", cliente.getTotal());
                cliente.processaPgto();
            }
        }
        cliente.liberaCarrinho();
        System.out.println("\nObrigado e volte sempre!");
    }    
}
