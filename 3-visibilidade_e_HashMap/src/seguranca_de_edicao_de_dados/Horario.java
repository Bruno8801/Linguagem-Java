package seguranca_de_edicao_de_dados;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Horario(int hora, int minuto, int segundo) { /*usei em formato 
        booleano para conseguir imprimir uma mensagem quando tudo for 
        verdadeiro, isso ajuda como feedback visual para alertar ao 
        usuário final se tudo ocorreu bem na inserção de seus dados */
        boolean okHora = setHora(hora);
        boolean okMinuto = setMinuto(minuto);
        boolean okSegundo = setSegundo(segundo);
        
        if (okHora && okMinuto && okSegundo) {
            System.out.println("Horário registrado com êxito!");
        } else {
            System.out.println("Erro ao registrar horário...");
        }
    }

    public int getHora() {
        return hora;
    }
    public boolean setHora(int hora) {
        if (hora >= 0 && hora <=23) {
            this.hora = hora;
            return true;
        }
        else {
            System.out.println("Hora inválida");
            return false;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean setMinuto(int minuto) {
        if (minuto >= 0 && minuto <=59) {
            this.minuto = minuto;
            return true;
        } else {
            System.out.println("Minutos inválido");
            return false;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public boolean setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
            return true;
        }
        else {
            System.out.println("Segundos inválidos");
            return false;
        }
    }
    
}
