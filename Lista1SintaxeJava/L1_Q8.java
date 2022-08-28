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
8 - Um quadrado mágico é uma matriz quadrada, de valores inteiros, na qual a 
soma dos elementos de cada linha, a soma dos elementos de cada coluna e a soma 
dos elementos da diagonal primária e da diagonal secundária são iguais. A matriz
quadrada de ordem 4 abaixo é um exemplo de quadrado mágico, no qual todas as 
somas são iguais a 34:
 4 14 15  1
 9  7  6 12
 5 11 10  8
16  2  3 13
Desenvolva um programa que leia do usuário uma matriz quadrada de ordem n e 
imprima se a matriz é um quadrado mágico ou não.
*/

import java.util.Scanner;

public class L1_Q8 
{
    public static int[][] matriz(int n)
    {
        Scanner teclado = new Scanner(System.in);
        int[][] M = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                System.out.print("M(" + (i+1) + "," + (j+1) + ") = ");
                M[i][j] = teclado.nextInt();
            }
        System.out.print("\n");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.printf("%2d\t", M[i][j]);
            System.out.print("\n");
        }
        return M;
    }   
    public static boolean igualdade_vetor(int n, int[] V)
    {
        for (int k = 1; k < n; k++)
            if (V[k] != V[k-1])
                return false;
        return true;
    }
    public static int[][] soma_LC(int n, int[][] M)
    {
        int[][] soma = new int[2][n];
        for (int i = 0; i < n; i++)
        {
            soma[0][i] = 0;
            soma[1][i] = 0;
            for (int j = 0; j < n; j++)
            {
                soma[0][i] += M[i][j];
                soma[1][i] += M[j][i];
            }
        }
        return soma;
    }
    public static int[] soma_diag(int n, int[][] M)
    {
        int[] sdiag = new int[2];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i == j)
                {
                    sdiag[0] += M[i][j];
                    sdiag[1] += M[i][(n-1)-j];
                }
        return sdiag;
    }
    public static boolean quadrado_magico(int n, int[][] M)
    {
        int[][] soma_lc = soma_LC(n, M);
        int[] sdiag = soma_diag(n, M);
        boolean t_lin = igualdade_vetor(n, soma_lc[0]);
        boolean t_col = igualdade_vetor(n, soma_lc[1]);
        boolean t_diag = igualdade_vetor(2, sdiag);
        return (t_lin && t_col && t_diag && (sdiag[0] == soma_lc[0][0]));
    }
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Verificando se uma matriz é um Quadrado Mágico\n");
        System.out.print("Dimensão da matriz -> ");
        int n = teclado.nextInt();
        System.out.println("Insira os elementos da matriz:");
        int[][] M = matriz(n);
        if (quadrado_magico(n, M))
            System.out.println("Essa matriz é um quadrado mágico.");
        else
            System.out.println("Essa matriz não é um quadrado mágico.");
    }
}
