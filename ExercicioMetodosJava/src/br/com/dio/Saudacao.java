package br.com.dio;
import java.util.Calendar;

public class Saudacao {
    public static void obtemHora(){
        int segundos;
        int minutos;
        int horas;
        Calendar data;

        data = Calendar.getInstance();
        horas = data.get(Calendar.HOUR_OF_DAY);
        minutos = data.get(Calendar.MINUTE);
        segundos = data.get(Calendar.SECOND);

        System.out.println("Hora atual = " + horas + ":" + minutos + ":" + segundos);
        if (horas > 18 || horas <= 4) {
            System.out.println("Boa noite!");
        }
        if (horas >= 5 && horas <= 12) {
            System.out.println("Bom dia!");
        }
        if (horas >= 13 && horas <= 18) {
            System.out.println("Boa tarde!");
        }


    }
}

