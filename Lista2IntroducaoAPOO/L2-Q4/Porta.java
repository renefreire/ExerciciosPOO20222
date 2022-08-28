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
Classe auxiliar para o exercício 4 da lista 2
*/

class Porta {
    boolean estado = false;
    String cor = "Branco";
    int altura = 200, largura = 65;
    
    void abrePorta(){
        this.estado = true;
    }
    void fechaPorta(){
        this.estado = false;
    }
    String estaAberta(){
        if (this.estado)
            return "Aberta";
        else
            return "Fechada";
    }
    void pintaPorta(String cor){
        this.cor = cor;
    }
    String corPorta(){
        return cor;
    }
    void alteraLargura(int dim){
        this.largura += dim;
    }
    void defLargura(int dim){
        this.largura = dim;
    }
    int larguraPorta(){
        return largura;
    }
    void alteraAltura(int dim){
        this.altura += dim;
    }
    void defAltura(int dim){
        this.altura = dim;
    }
    int alturaPorta(){
        return altura;
    }
    void exibePorta(){
        System.out.println("Estado: " + estaAberta());
        System.out.println("Cor: " + corPorta());
        System.out.println("Dimensões: " + larguraPorta() + "cm X " + 
                           alturaPorta() + "cm");
        System.out.println("");
    }
}

