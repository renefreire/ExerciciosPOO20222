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
3 - Imprima a soma de 1 até 999.
*/

public class L1_Q3 
{
    public static void main(String[] args) 
    {
        int n = 0;
        System.out.println("Soma de 1 até 999\n");
        for (int i = 1; i <= 999; i++)
            n += i;
        System.out.println("Resultado = " + n);
    }
}
