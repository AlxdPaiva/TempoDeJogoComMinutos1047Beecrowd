/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tempodejogocomminutos1047beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class TempoDeJogoComMinutos1047Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int horaInicial = teclado.nextInt();
        int minutoInicial = teclado.nextInt();
        int horaFinal = teclado.nextInt();
        int minutoFinal = teclado.nextInt();
                       
        int inicioEmMinutos = horaInicial * 60 + minutoInicial;
        int fimEmMinutos = horaFinal * 60 + minutoFinal;
        
        int duracaoEmMinutos;
        
        if (fimEmMinutos <= inicioEmMinutos) {
            duracaoEmMinutos = (24 * 60 - inicioEmMinutos) + fimEmMinutos;
        } else {
            duracaoEmMinutos = fimEmMinutos - inicioEmMinutos;
        }
        
        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;
        
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
    }
    
}
