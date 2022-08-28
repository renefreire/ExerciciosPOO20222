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

public class Carta {
    int valor = 0, naipe = 0, pontos = 0;
    Carta prox;
    
    int getNaipe(){
        return naipe;
    }
    int getValor(){
        return valor;
    }
    int getPontos(){
        return pontos;
    }
    int[] getCarta(){
        int[] info_carta = new int[2];
        info_carta[0] = this.naipe;
        info_carta[1] = this.valor;
        return info_carta;
    }
    void setCarta(int naipe, int valor){
        if ((naipe >= 1)&&(naipe <= 4))
            this.naipe = naipe;
        if ((valor >= 1)&&(valor <= 13))
            this.valor = valor;
    }
    void setPontosSueca(int valor){
        switch (valor) {
            case 1 -> this.pontos = 11;           
            case 7 -> this.pontos = 10;
            case 11 -> this.pontos = 2;
            case 12 -> this.pontos = 3;
            case 13 -> this.pontos = 4;
            default -> this.pontos = 0;
        }
    }
    String getNomeNaipe(){
        switch (this.naipe) {
            case 1 -> {return "ESPADAS";}
            case 2 -> {return "COPAS";}
            case 3 -> {return "PAUS";}
            case 4 -> {return "OUROS";}
            default -> {return null;}
        }
    }
    String getNomeValor(){
        switch (this.valor) {
            case 1 -> {return "A";}
            case 11 -> {return "Q";}
            case 12 -> {return "J";}
            case 13 -> {return "K";}
            default -> {return Integer.toString(this.valor);}
        }
    }
    String getNomeCarta(){
        String snaipe = switch (this.naipe){
            case 1 -> "ESPADAS";
            case 2 -> "COPAS";
            case 3 -> "PAUS";
            case 4 -> "OUROS";
            default -> "NULO";
        };
        String svalor = switch (this.valor) {
            case 1 -> "A";
            case 11 -> "Q";
            case 12 -> "J";
            case 13 -> "K";
            default -> Integer.toString(this.valor);
        };
        return svalor + " de " + snaipe;
    }
    Carta getProx(){
        return prox;
    }
    void setProx(Carta prox){
        this.prox = prox;
    }
}
