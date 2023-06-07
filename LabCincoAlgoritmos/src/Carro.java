public class Carro {
int idPlaca;
String modelo;
int year;
String color;

Carro izquierdo, derecho;

    public Carro(int idPlaca, String modelo, int year, String color, Carro izquierdo, Carro derecho) {
        this.idPlaca = idPlaca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public String toString(){
        return "Carro{" +
                "idPlaca=" + idPlaca +
                ", modelo=" + modelo +
                ", year=" + year +
                ", color=" + color +
                "}";
    }


}

