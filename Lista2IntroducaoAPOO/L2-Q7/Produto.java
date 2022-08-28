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

public class Produto {
    String produto;
    double preco = 0;
    int id = 0, quant = 0, estoque = 100;
    Produto prox;
    
    int getID(){
        return id;
    }
    void setID(int id){
        this.id = id;
    }
    String getProduto(){
        return produto;
    }
    void setProduto(){
        switch (this.id) {
            case 1 -> this.produto = "Cenoura a granel kg";
            case 2 -> this.produto = "Cebola a granel kg";
            case 3 -> this.produto = "Tomate a granel kg";
            case 4 -> this.produto = "Tapioca da Terrinha 500g";
            case 5 -> this.produto = "Ovo Branco dúzia";
            case 6 -> this.produto = "Alho a granel kg";
            case 7 -> this.produto = "Laranja Pera a granel kg";
            case 8 -> this.produto = "Laranja Lima a granel kg";
            case 9 -> this.produto = "Mamao Formosa a granel kg";
            case 10 -> this.produto = "Uva vermelha s/ semente 500g";
            case 11 -> this.produto = "Manga Palmer Extra a granel kg";
            case 12 -> this.produto = "Maca Red importada a granel kg";
            case 13 -> this.produto = "Pera Williams a granel kg";
            case 14 -> this.produto = "Guarana Antartica 2L";
            case 15 -> this.produto = "Pepsi 2L";
            case 16 -> this.produto = "Arroz Maximo 5kg";
            case 17 -> this.produto = "Cafe Tres Coracoes 500g";
            case 18 -> this.produto = "Cafe Evolutto Extra Forte 500g";
            case 19 -> this.produto = "Alimento infantil Nestle 120g";
            case 20 -> this.produto = "File de Peito de Frango Seara 1kg";
            case 21 -> this.produto = "Maionese Arisco Trad. 500g";
            case 22 -> this.produto = "Ketchup Hellmann's Trad. 380g";
            case 23 -> this.produto = "Leite Condensado Moça 395g";
            case 24 -> this.produto = "Pao de Forma Trad. Plus Vita 500g";
            case 25 -> this.produto = "Pao de Forma Integral Plus Vita 500g";
            default -> this.produto = "Estou satisfeito!";
        }
    }
    double getPreco(){       
        return preco;
    }
    void setPreco(){
        switch (this.id) {
            case 1 -> this.preco = 3.17; 
            case 2 -> this.preco = 5.99;
            case 3 -> this.preco = 3.99;
            case 4 -> this.preco = 8.35;
            case 5 -> this.preco = 8.89;
            case 6 -> this.preco = 7.17;
            case 7 -> this.preco = 3.17;
            case 8 -> this.preco = 6.29;
            case 9 -> this.preco = 7.99;
            case 10 -> this.preco = 9.99;
            case 11 -> this.preco = 7.98;
            case 12 -> this.preco = 9.39;
            case 13 -> this.preco = 19.89;
            case 14 -> this.preco = 5.49;
            case 15 -> this.preco = 5.19;
            case 16 -> this.preco = 21.79;
            case 17 -> this.preco = 10.99;
            case 18 -> this.preco = 9.99;
            case 19 -> this.preco = 3.15;
            case 20 -> this.preco = 10.98;
            case 21 -> this.preco = 3.89;
            case 22 -> this.preco = 6.59;
            case 23 -> this.preco = 5.99;
            case 24 -> this.preco = 5.89;
            case 25 -> this.preco = 6.90;
            default -> this.preco = 0.00;
        }
    }
    int getEstoque(){
        return estoque;
    }
    void setEstoque(int q){
        estoque += q;
    }
    int getQuant(){
        return quant;
    }
    void setQuant(int quant){
        if (quant < 0)
            this.quant = 0;
        else
            this.quant = quant;
    }
    double getSubtotal(){
        return (quant*preco);
    }
    Produto getProx(){
        return prox;
    }
    void setProx(Produto prox){
        this.prox = prox;
    }
}
