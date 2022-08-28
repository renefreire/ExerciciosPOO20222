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
6 - Imprima os primeiros números da série de Fibonacci até passar de 100. A 
série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para 
calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por diante, o 
n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento 
(ex: 8 = 5 + 3)
*/
public class L1_Q6 
{
    public static void main(String[] args) 
    {
        int f1 = 0, f2 = 1, fib = 0, k = 0;
        System.out.println("Primeiros números de Fibonacci até passar de 100:");
        System.out.println("");
        while (fib <= 100)
        {
            if (k == 0)
                System.out.print(f1 + " ");
            else if (k == 1)
                System.out.print(f2 + " ");
            else if (k > 1)
            {
                fib = f1 + f2;
                System.out.print(fib + " ");
                f1 = f2;
                f2 = fib;
            }
            k++;
        }
        System.out.println("");
    }
}
