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
Classe auxiliar para o exercício 7 da lista 2
*/

import java.util.Scanner;

public class Pedido {
    String cliente, endereco, forma;
    int pedido;
    double total = 0;
    Produto item;
    
    String getCliente(){
        return cliente;
    }
    void setCliente(String cliente){
        this.cliente = cliente;
    }
    String getEndereco(){
        return endereco;
    }
    void setEndereco(String endereco){
        this.endereco = endereco;
    }
    String getForma(){
        return forma;
    }
    void setForma(int id){
        switch (id){
            case 1 -> this.forma = "Dinheiro";
            case 2 -> this.forma = "Cartão";
            case 3 -> this.forma = "Cheque";
            default -> this.forma = "Escolha uma forma de pagamento.";
        }
    }
    int getPedido(){
        return pedido;
    }
    void setPedido(int pedido){
        this.pedido = pedido;
    }
    double getTotal(){
        double k = 0;
        for (Produto p = item; p != null; p = p.getProx())
            k += p.getSubtotal();
        total = k;
        return total;
    }
        
    void criaEstoque(){
        for (int id = 1; id <= 25; id++){
            Produto novo = new Produto();
            novo.setID(id);
            novo.setProduto();
            novo.setPreco();
            novo.setProx(null);
            Produto p = item;
            Produto q = item;
            while (p != null){
                q = p;
                p = p.getProx();
            }
            if (q != null)
                q.setProx(novo);
            else                
                item = novo;
        }
    }
    void exibeEstoque(){
        System.out.println("\nProdutos à disposição:");
        for (Produto p = item; p != null; p = p.getProx())
            System.out.printf("%d - %s: R$%.2f (%d unid. no estoque)\n",  
                    p.getID(), p.getProduto(), p.getPreco(), p.getEstoque());        
    }
    void pegaCarrinho(){
        item = null;
    }
    void addItem(Produto novo){
        Scanner teclado = new Scanner(System.in);
        if (novo.getEstoque() > 0){
            System.out.printf("%s: R$%.2f\n",novo.getProduto(),novo.getPreco());
            System.out.print("Quantidade -> ");
            int quant = Integer.parseInt(teclado.nextLine());
            Produto add = new Produto();
            add.setID(novo.getID());
            add.setProduto();
            add.setPreco();
            add.setQuant(quant);
            add.setEstoque(-quant);
            add.setProx(item);
            item = add;
            System.out.printf("\nTOTAL = R$%.2f\n", getTotal());
        }
        else
            System.out.println("O produto está esgotado!");       
    }
    void mostraCarrinho(){
        System.out.println("Item   Produto(ID)   Preço(R$)    Quant.   "
                + "Subtotal(R$)  ");
        int i = 1;
        for (Produto p = item; p != null; p = p.getProx()){ 
            System.out.printf("%4d %9d         %6.2f      %4d      %6.2f\n", i, 
                    p.getID(), p.getPreco(), p.getQuant(), p.getSubtotal());
            i++;
        }
    }
    boolean carrinhoVazio(){
        return (item == null);
    }
    Produto buscaProduto(int id){
        for (Produto p = item; p != null; p = p.getProx()){
            if (p.getID() == id)
                return p;
        }
        System.out.println("Este produto não está disponível.");
        return null;
    }
    void retiraItem(Produto fora){
        Scanner teclado = new Scanner(System.in);
        if (fora != null){
            System.out.printf("%s: R$%.2f\n",fora.getProduto(),fora.getPreco());
            System.out.print("Quantidade a retirar -> ");
            int quant = Integer.parseInt(teclado.nextLine());
            if (fora.getQuant() <= quant){
                Produto anterior = null;
                Produto p = item;
                while ((p != null)&&(p.getID() != fora.getID())){
                    anterior = p;
                    p = p.getProx();
                }
                if (p == null){
                    System.out.println("Este produto não está no carrinho.");
                    return;
                }
                fora.setEstoque(quant);
                if (anterior == null)
                    item = p.getProx();
                else
                    anterior.setProx(p.getProx());
            }
            else{
                fora.setQuant(fora.getQuant() - quant);
                fora.setEstoque(quant);
            }
            System.out.printf("\nTOTAL = R$%.2f\n", getTotal());
        }
    }
    void liberaCarrinho(){
        while (item != null){
            Produto aux = item.getProx();
            item = null;
            item = aux;
        }
    }
    void processaPgto(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nCadastre seus dados para entrega:");
        System.out.print("Nome: ");
        setCliente(teclado.nextLine());
        System.out.print("Endereço: ");
        setEndereco(teclado.nextLine());
        String flag = "S";
        while (flag.compareToIgnoreCase("S") == 0){
            System.out.println("Forma de Pagamento:");
            System.out.println("1 - Dinheiro");
            System.out.println("2 - Cartão");
            System.out.println("3 - Cheque");
            System.out.print("-> ");
            int id = Integer.parseInt(teclado.nextLine());
            setForma(id);
            switch (getForma()){
                case "Dinheiro" -> {
                    System.out.print("\nDinheiro Total = R$");
                    double dt = Double.parseDouble(teclado.nextLine());
                    while (dt < getTotal()){
                        System.out.println("Não é suficiente");
                        System.out.print("Dinheiro Total = R$");
                        dt = Double.parseDouble(teclado.nextLine());
                    }
                    double troco = dt - getTotal();
                    if (troco > 0)
                        System.out.printf("Troco de R$%.2f", troco);
                    flag = "N";
                }
                case "Cartão" -> {
                    System.out.print("\nNúmero do cartão (16 dígitos) = ");
                    String nc = teclado.nextLine();
                    System.out.print("\nCódigo de segurança (3 dígitos) = ");
                    String cs = teclado.nextLine();
                    while ((nc.length() != 16)||(cs.length() != 3)){
                        System.out.println("Cartão inválido!");
                        System.out.print("\nNúmero do cartão (16 dígitos) = ");
                        nc = teclado.nextLine();
                        System.out.print("\nCódigo de segurança (3 dígitos) = ");
                        cs = teclado.nextLine();
                    }
                    flag = "N";
                }
                case "Cheque" -> {
                    System.out.print("\nValor do cheque = R$");
                    double ch = Double.parseDouble(teclado.nextLine());
                    while (ch != getTotal()){
                        System.out.print("O cheque deve ter o mesmo valor ");
                        System.out.println("da compra.");
                        System.out.print("\nValor do cheque = R$");
                        ch = Double.parseDouble(teclado.nextLine());
                    }
                    flag = "N";
                }
                default -> {
                    System.out.println(getForma());
                    System.out.println("Deseja continuar a compra? (S/N)");
                    flag = teclado.nextLine();
                }
            }
        }
        if (getForma().compareTo("Escolha uma forma de pagamento.") != 0){
            setPedido(12345);
            System.out.println("\nNúmero do Pedido -> " + getPedido());
            System.out.println("\nAgora é só aguardar o nosso entregador!");
        }
    }
}
