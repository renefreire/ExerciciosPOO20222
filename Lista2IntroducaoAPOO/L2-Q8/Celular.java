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

import java.util.Scanner;
import java.io.IOException;

class Celular {
    Bateria bateria = new Bateria();
    
    void painel(){
        System.out.println("Bateria: " + this.bateria.getCarga() + "%\n");
    }
    void mensagem(){
        Scanner teclado = new Scanner(System.in);
        teclado.next();
        int carga = bateria.getCarga();
        carga--;
        bateria.setCarga(carga);
    }
    void ligacao() throws IOException{
        long inicio = System.currentTimeMillis();
        System.out.print("Em chamada...");
        System.in.read();
        long fim = System.currentTimeMillis();
        long tempo = (fim - inicio)/1000;
        int h = (int) (tempo/3600);
        int m = (int) ((tempo - h/3600)/60);
        int s = (int) (tempo - (h*3600 + m*60));
        System.out.printf("Duração da ligação: %d:%02d:%02d\n", h, m, s);
        int carga = bateria.getCarga() - ((int) (tempo/5));
        bateria.setCarga(carga);
    }
    void recarga() throws IOException{
        long inicio = System.currentTimeMillis();
        System.out.print("Carregando...");
        System.in.read();
        long fim = System.currentTimeMillis();
        long tempo = (fim - inicio)/1000;
        int h = (int) (tempo/3600);
        int m = (int) ((tempo - h/3600)/60);
        int s = (int) (tempo - (h*3600 + m*60));
        System.out.printf("Duração da recarga: %d:%02d:%02d\n", h, m, s);
        int carga = bateria.getCarga() + ((int) (tempo/60));
        bateria.setCarga(carga);
    }
}