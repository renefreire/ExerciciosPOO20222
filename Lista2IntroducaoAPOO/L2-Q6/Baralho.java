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
Classe auxiliar para o exercício 6 da lista 2
*/

import java.util.Random;
import java.util.Scanner;

public class Baralho {
    Carta carta;
    
    void geraBaralhoCompleto(){
        int c[] = new int [52];
        for (int i = 0; i < 52; i++)
            c[i] = i;
        Random random = new Random();
        for (int i = 0; i < 52; i++){
            int j = random.nextInt(52);
            int aux = c[i];
            c[i] = c[j];
            c[j] = aux;
        }        
        for (int i = 0; i < 52; i++){
            int v = c[i]/4;
            int n = c[i] - 4*v;
            Carta novo = new Carta();
            novo.setCarta(n+1, v+1);
            novo.setProx(carta);
            carta = novo;
        }
    }
    void geraBaralhoSueca(){
        int c[] = new int [40];
        for (int i = 0; i < 40; i++)
            c[i] = i;
        Random random = new Random();
        for (int i = 0; i < 40; i++){
            int j = random.nextInt(40);
            int aux = c[i];
            c[i] = c[j];
            c[j] = aux;
        }
        for (int i = 0; i < 40; i++){
            int v = c[i]/4;
            int n = c[i] - 4*v;
            if (v+1 > 7)
                v += 3;
            Carta novo = new Carta();
            novo.setCarta(n+1, v+1);
            novo.setPontosSueca(v+1);
            novo.setProx(carta);
            carta = novo;
        }
    }
    void criaMao(){
        carta = null;
    }
    Carta distribuiCarta(){
        Carta topo = new Carta();
        if (carta != null){
            topo = carta;
            carta = carta.getProx();
            topo.setProx(null);
        }
        return topo;
    }
    void organizaMao(int[] info_carta){
        Carta anterior = null, c = carta;
        while ((c != null)&&((info_carta[0] > c.getNaipe())||
               ((info_carta[1] == c.getNaipe())&&
                (info_carta[1] > c.getValor())))){
            anterior = c;
            c = c.getProx();
        }
        Carta novo = new Carta();
        novo.setCarta(info_carta[0], info_carta[1]);
        if (anterior == null){
            novo.setProx(carta);
            carta = novo;
        }else{
            novo.setProx(anterior.getProx());
            anterior.setProx(novo);
        }
    }
    Carta jogaCartaSueca(int naipe, int valor){
        Carta anterior = null, c = carta, jogada = new Carta();
        while ((c != null)&&((c.getValor() != valor)||(c.getNaipe() != naipe))){
            anterior = c;
            c = c.getProx();
        }
        if (c == null){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Esta carta não está disponível!");
            System.out.print("Jogada -> Naipe: ");
            naipe = teclado.nextInt();
            System.out.print("       -> Valor: ");
            valor = teclado.nextInt();
            return jogaCartaSueca(naipe, valor);
        }
        System.out.println(c.getNomeCarta());
        jogada.setCarta(naipe, valor);
        if (anterior == null)
            carta = c.getProx();
        else
            anterior.setProx(c.getProx());
        return jogada;
    }
    void depositaCarta(int[] info_carta){
        Carta novo = new Carta();
        novo.setCarta(info_carta[0], info_carta[1]);
        novo.setProx(null);
        Carta p = carta, q = carta;
        while (p != null){
            q = p;
            p = p.getProx();
        }
        if (q != null){
            q.setProx(novo);
            carta = q;
        }
        else
            carta = novo;
    }
    int[] pontuacaoRodadaSueca(int[] jogadores, int puxada, int trunfo){
        int vencedor[] = {0, 0}, k = 0;
        Carta maior = carta;
        vencedor[0] = jogadores[0];
        vencedor[1] = maior.getPontos();
        for (Carta c = carta.getProx(); c != null; c = c.getProx()){
            if (maior.getNaipe() == trunfo)
                if ((maior.getNaipe() == c.getNaipe())&&
                    (maior.getPontos() < c.getPontos())){
                        maior = c;
                        vencedor[0] = jogadores[k+1];
                    }
            else if (maior.getNaipe() == puxada)
                if ((c.getNaipe() == trunfo)||
                    ((c.getNaipe() == puxada)&&
                    (maior.getPontos() < c.getPontos()))){
                    maior = c;
                    vencedor[0] = jogadores[k+1];
                }            
            else
                if ((c.getNaipe() == trunfo)||(c.getNaipe() == puxada)){
                    maior = c;
                    vencedor[0] = jogadores[k+1];
                }
            vencedor[1] += c.getPontos();
            k++;
        }
        return vencedor;
    }
    boolean ehRenuncia(int naipe, int puxada){
        if (naipe != puxada)
            for (Carta c = carta; c != null; c = c.getProx())
                if (c.getNaipe() == puxada)
                    return true;
        return false;
    }
    void limpaMesa(){
        while (carta != null){
            Carta aux = carta.getProx();
            carta = null;
            carta = aux;
        }
    }
    boolean maoVazia(){
        return (carta == null);
    }
    void exibeMao(){
        for (Carta c = carta; c != null; c = c.getProx())
            System.out.println(c.getNomeCarta());
    }
}
