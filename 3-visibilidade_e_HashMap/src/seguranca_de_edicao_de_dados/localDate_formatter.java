package seguranca_de_edicao_de_dados;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class localDate_formatter {
    public static void main(String[] args) {
        LocalTime horario = LocalTime.now();
        LocalDate dataHoje = LocalDate.now(); // geração automatica de data para cadastro usando a data do dispositivo e o dia com o elemento (EEEE) em tempo real.
        DateTimeFormatter dtFormatada = DateTimeFormatter.ofPattern("dd/MM/yyy - EEEE, ");
        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(dataHoje);
        System.out.println("Dia: " + dataHoje.format(dtFormatada) + "Horário: " + horario.format(horaFormatada));

/*------------------------------------------------------------------ */  

        LocalDate dataInserida = LocalDate.of(2026, 5, 29); // inserção de data manual para cadastrar datas como também datas de nascimento.

        System.out.println(dataInserida);
        System.out.println(dataInserida.format(dtFormatada));
    }    

}
