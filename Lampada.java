package avaliacao.lampada;
public class Lampada {
    //variável para verificar se a lampada esta acesa
    public boolean acesa;
    public int watts;
   //construtor caso potencia seja informada
    public Lampada(boolean acesa,int watts) {
        this.acesa = acesa;
        this.watts = watts;
    }
    //construtor caso a potência nao seja informada, define 60 por padrão
    public Lampada(boolean acesa){
        this.acesa = acesa;
        watts = 60;
    }
//método para trocar o valor da váriavel acesa
    public void interruptor() {
        acesa = !acesa;
        if (acesa) {
            System.out.println("A lâmpada foi ligada.");
        } else {
            System.out.println("A lâmpada foi desligada.");
        }
    }
    //método que configura a variável watts
    public void setwatts(int watts){
        this.watts = watts;
    }
    //método que verifica se a variável watts esta no intervalo de 1 á 1000, se estiver retorna o valor normalmente, senão reorna 60
    public int getwatts(){
        if(watts>1 && watts<1000){
            return watts;
    }else{
        System.out.println("potencia inválida! definido potencia padrao 60 watts");
        return 60;
    }
    }
    //método para informar se a lampada esta ou nao acesa
    public void mostrarEstado() {
        if (acesa == true) {
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada está apagada.");
        }
    }
}