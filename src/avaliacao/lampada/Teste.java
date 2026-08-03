package avaliacao.lampada;
public class Teste{
public static void main(String[] args) {
        Lampada lampada1 = new Lampada(false,58);
        System.out.println("watts: " + lampada1.getwatts());
        lampada1.mostrarEstado(); 
        lampada1.interruptor(); 
        lampada1.mostrarEstado();
        lampada1.interruptor();
        lampada1.mostrarEstado(); 
    }
}