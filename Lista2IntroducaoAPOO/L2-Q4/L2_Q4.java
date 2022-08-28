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
4 - Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e
feche as mesmas como desejar. Utilize o método quantasPortasEstaoAbertas
para imprimir o número de portas abertas.
*/

public class L2_Q4 {
    public static void main(String[] args) {
        Casa casa = new Casa();
        System.out.println("Casa\n");
        casa.exibeCasa();
        casa.pintaCasa("Azul");
        casa.exibeCasa();
        casa.pintaCasa("Vermelho");
        casa.exibeCasa();
        casa.p1.abrePorta();
        casa.exibeCasa();
        casa.p2.abrePorta();
        casa.exibeCasa();
        casa.p1.fechaPorta();
        casa.exibeCasa();
        casa.p3.abrePorta();
        casa.exibeCasa();
        casa.p1.abrePorta();
        casa.exibeCasa();
    }   
}
