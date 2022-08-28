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
Classe auxiliar para o exercício 5 da lista 2
*/

class Televisao {
    boolean estado = false, silencioso = false;
    int volume = 5, canal = 15;

    void onOff(){
        this.estado = !this.estado;
    }
    String estaLigado(){
        if (this.estado)
            return "Ligado";
        else
            return "Desligado";
    }
    void incVolume(){
        if (this.silencioso){
            this.volume = 0;
            this.silencioso = false;
        }
        this.volume++;
        if (this.volume > 10)
            this.volume = 10;
    }
    void decVolume(){
        this.volume--;
        if (this.volume < 0)
            this.volume = 0;
    }
    int volumeTV(){
        return volume;
    }
    void incCanal(){
        this.canal++;
        if (this.canal > 99)
            this.canal = 0;
    }
    void decCanal(){
        this.canal--;
        if (this.canal < 0)
            this.canal = 99;
    }
    void defCanal(int canal){
        if ((canal <= 99)&&(canal >= 0))
            this.canal = canal;
    }
    int canalTV(){
        return canal;
    }
    void modoSilencioso(){
        this.silencioso = !this.silencioso;
    }
    String estaSilenciado(){
        if (this.silencioso)
            return "Ligado";
        else
            return "Desligado";
    }
    void exibeTV(){
        System.out.println("Estado: " + estaLigado());
        System.out.println("Canal: " + canalTV());
        System.out.println("Volume: " + volumeTV());
        System.out.println("Silencioso: " + estaSilenciado());
        System.out.println("");
    }
}
