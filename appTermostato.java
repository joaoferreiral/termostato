public class appTermostato {
    public static void main(String[] args) {
        
        Termostato termostato = new Termostato(80);

        termostato.ligarTermostato();
        for (int i = 0; i < 3; i ++){
            termostato.aumentarTemperatura();
        }
        for (int i = 0; i < 5; i ++){
            termostato.diminuirTemperatura();
        }
        System.out.println("Temperatura atual: " + termostato.getTemperatura());
        for (int i = 0; i < 2; i ++){
            termostato.aumentarTemperatura();
        }
        System.out.println("Temperatura atual: " + termostato.getTemperatura());
        for (int i = 0; i < 8; i ++){
            termostato.aumentarTemperatura();
        }
        for (int i = 0; i < 2; i ++){
            termostato.diminuirTemperatura();
        }
        termostato.desligarTermostato();
        System.out.println("Temperatura atual: " + termostato.getTemperatura());
    }
}