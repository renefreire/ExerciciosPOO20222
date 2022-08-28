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
3 -  Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere
suas dimensões e use o método estaAberta para verificar se ela está aberta.
*/

public class L2_Q3 {
    public static void main(String[] args) {
        Porta porta = new Porta();
        System.out.println("Porta\n");
        porta.exibePorta();
        porta.abrePorta();
        porta.exibePorta();
        porta.fechaPorta();
        porta.exibePorta();
        porta.pintaPorta("Azul");
        porta.exibePorta();
        porta.pintaPorta("Amarelo");
        porta.exibePorta();
        porta.pintaPorta("Vermelho");
        porta.exibePorta();
        porta.alteraLargura(20);
        porta.exibePorta();
        porta.alteraAltura(40);
        porta.exibePorta();
    }
}
