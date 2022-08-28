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

class Casa {
    String cor = "Branco";
    Porta p1 = new Porta();
    Porta p2 = new Porta();
    Porta p3 = new Porta();
    
    void pintaCasa(String cor){
        this.cor = cor;
    }
    String corCasa(){
        return cor;
    }
    void quantasPortasEstaoAbertas(){
        int np = 0;
        if (this.p1.estado)
            np++;
        if (this.p2.estado)
            np++;
        if (this.p3.estado)
            np++;
        System.out.println("Número de portas abertas: " + np);
    }
    void exibeCasa(){
        System.out.println("Cor: " + corCasa());
        System.out.println("Porta 1: " + this.p1.estaAberta());
        System.out.println("Porta 2: " + this.p2.estaAberta());
        System.out.println("Porta 3: " + this.p3.estaAberta());
        this.quantasPortasEstaoAbertas();
        System.out.println("");
    }
}
