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
Classe auxiliar para o exercício 2 da lista 2
*/

class Pessoa {
    String nome = "Rene Cruz Freire";
    int idade = 34;
    
    String getNome(){
        return nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    int getIdade(){
        return idade;
    }
    void setIdade(int idade){
        this.idade = idade;
    }
    void exibePessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("");
    }
    void aniversario(){
        System.out.println("Feliz aniversário!");
        this.idade++;
        System.out.println("");
    }
}
