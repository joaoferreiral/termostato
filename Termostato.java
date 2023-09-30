public class Termostato {
    private double temperatura;
    private boolean status;

    public Termostato(double temperatura) {
        this.temperatura = temperatura;
        this.status = false;
    }

    public double getTemperatura() {
        return temperatura;
    }
    public boolean getStatus() {
        return status;
    }
    public void setTemperatura() {
        this.temperatura = temperatura;
    }

    public boolean ligarTermostato() {
    if(status == false) {
        this.status = true;
        return true;
        }
        return false;
    }
    public boolean desligarTermostato() {
        if(status == true) {
            this.status = false;
            this.temperatura = 0;
            return false;
        }
        return true;
    }
    public void aumentarTemperatura() {
        if (this.temperatura < 85) {
            this.temperatura ++;
        }
    }
    public void diminuirTemperatura() {
        if (this.temperatura > 80) {
            this.temperatura --;
        }

    }
}
