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
Classe auxiliar para o exercício 8 da lista 2
*/

class Bateria {
    int carga = 100;
    
    int getCarga(){
        return carga;
    }
    void setCarga(int carga){
        if (carga > 100)
            this.carga = 100;
        else if (carga < 0)
            this.carga = 0;
        else
            this.carga = carga;
    }
}
