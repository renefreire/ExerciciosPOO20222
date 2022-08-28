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
6 - Para implementar jogos com cartas, são necessárias classes para representar 
uma carta individual e também um baralho. Sugira implementações para essas 
classes, considerando:
a. Cartas - ás, 2 a 9, valete, dama e rei, dos naipes copas, espadas, ouros e
paus
b. Baralho - conjunto de 52 cartas (13 cartas de cada naipe), em ordem ou
embaralhado
*/

import java.util.Scanner;

public class L2_Q6 {
    public static int primeiro(Baralho mao, Baralho mesa){
        Scanner teclado = new Scanner(System.in);
        
        mao.exibeMao();
        System.out.print("Jogada -> Naipe: ");
        int puxada = teclado.nextInt();
        System.out.print("       -> Valor: ");
        int valor = teclado.nextInt();
        Carta carta = mao.jogaCartaSueca(puxada, valor);
        mesa.depositaCarta(carta.getCarta());
        return puxada;
    }
    public static void rodada(Baralho mao, Baralho mesa, int puxada){
        Scanner teclado = new Scanner(System.in);
        
        mao.exibeMao();
        System.out.print("Jogada -> Naipe: ");
        int naipe = teclado.nextInt();
        System.out.print("       -> Valor: ");
        int valor = teclado.nextInt();
        Carta carta = mao.jogaCartaSueca(naipe, valor);
        while (mao.ehRenuncia(naipe, puxada)){
            mao.organizaMao(carta.getCarta());
            System.out.println("Siga o naipe da rodada!");
            System.out.print("Jogada -> Naipe: ");
            naipe = teclado.nextInt();
            System.out.print("       -> Valor: ");
            valor = teclado.nextInt();
            carta = mao.jogaCartaSueca(naipe, valor);
        }
        mesa.depositaCarta(carta.getCarta());
    }
    public static int[] giraPanela(int[] ordem){
        int aux = ordem[0];
        ordem[0] = ordem[1];
        ordem[1] = ordem[2];
        ordem[2] = ordem[3];
        ordem[3] = aux;
        return ordem;
    }
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        Baralho[] jogador = new Baralho[4];
        for (int i = 0; i < 4; i++)
            jogador[i] = new Baralho();
        int pontuacao[] = {0, 0};
        int ordem[] = {1, 2, 3, 4};
        int trunfo, puxada;
        Carta carta = new Carta();
        Baralho mesa = new Baralho();
        
        System.out.println("*************SUECA CHAMPIONS LEAGUE*************");
        System.out.println("\nNaipes:\n1-ESPADAS\n2-COPAS\n3-PAUS\n4-OUROS");
        System.out.println("\nValores:\n1-A\n12-Q\n13-J\n14-K");
        System.out.println("Restante dos valores de acordo com a numeração");
        System.out.println("\nEmbaralhando as cartas...");
        baralho.criaMao();
        baralho.geraBaralhoSueca();
        for (int i = 0; i < 4; i++)
            jogador[i].criaMao();
        mesa.criaMao();
        System.out.println("\nDistribuindo as cartas...");
        while (!baralho.maoVazia())
            for (int j = 0; j < 4; j++){
                carta = baralho.distribuiCarta();
                jogador[j].organizaMao(carta.getCarta());
            }
        trunfo = carta.getNaipe();
        System.out.println("\nTRUNFO: " + carta.getNomeNaipe());
        for (int i = 1; i <= 10; i++){
            System.out.println("\n*******************************************");
            System.out.println("Rodada " + i);
            System.out.println("\nMão Jogador " + ordem[0] + ":");
            puxada = primeiro(jogador[ordem[0]-1], mesa);
            for (int j = 1; j < 4; j++){
                System.out.println("\nMão Jogador " + ordem[j] + ":");
                rodada(jogador[ordem[j]-1], mesa, puxada);
            }
            System.out.println("\nMesa ao final da rodada:");
            mesa.exibeMao();
            int[] vencedor = mesa.pontuacaoRodadaSueca(ordem, puxada, trunfo);
            if (vencedor[0] % 2 != 0)
                pontuacao[0] += vencedor[1];
            else
                pontuacao[1] += vencedor[1];
            System.out.println("\nPLACAR:");
            System.out.println("DUPLA 1 -> " + pontuacao[0] + " pts");
            System.out.println("DUPLA 2 -> " + pontuacao[1] + " pts");
            ordem = giraPanela(ordem);
            mesa.limpaMesa();
        }
        System.out.println("\nVENCEDOR:");
        if (pontuacao[0] > pontuacao[1])
            System.out.println("DUPLA 1 COM " + pontuacao[0] + "pts.");
        else
            System.out.println("DUPLA 2 COM " + pontuacao[1] + "pts.");
        System.out.println("\nDUAS PALAVRAS: PARA BÉNS!");
    }
}
