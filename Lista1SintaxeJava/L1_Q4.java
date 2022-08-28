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
Lista de Exercícios 1
4 - Imprima todos os múltiplos de 3, entre 1 e 100.
*/

public class L1_Q4 
{
    public static void main(String[] args) 
    {
        System.out.println("Múltiplos de 3 entre 1 e 100:");
        for (int i = 3; i <= 100; i += 3)
            System.out.println(i);
    }
}
