public class Carro {
int idPlaca;
int year;
String modelo;
String color;
Carro izquierdo;
Carro derecho;

    public Carro(int idPlaca, String modelo, int year, String color, Carro izquierdo, Carro derecho) {
        this.idPlaca = idPlaca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public int getIdPlaca() {
        return idPlaca;
    }

    public void setIdPlaca(int idPlaca) {
        this.idPlaca = idPlaca;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Carro getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Carro izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Carro getDerecho() {
        return derecho;
    }

    public void setDerecho(Carro derecho) {
        this.derecho = derecho;
    }

    public String toString(){
        return "idPlaca=" + idPlaca +
                ", modelo=" + modelo +
                ", year=" + year +
                ", color=" + color;
    }
}

