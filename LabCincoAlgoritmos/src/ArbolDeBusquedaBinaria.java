import org.w3c.dom.Node;

import java.util.Scanner;

public class ArbolDeBusquedaBinaria {
    Carro raiz;
    Scanner entrada = new Scanner(System.in);


    // apuntamos la raiz a null
    public ArbolDeBusquedaBinaria() {
        this.raiz = null;
    }


    // menú principal que muestra las funcionalidades
    public void menuPrincipal() {
        StringBuilder sB = new StringBuilder("Menu Principal")
                .append("\n Elija una opción:")
                .append("\n Opción 1: Agregar un carro")
                .append("\n Opción 2: Eliminar un carro ")
                .append("\n Opción 3: Mostrar en orden PreOrden ")
                .append("\n Opción 4: Mostrar en orden EnOrden ")
                .append("\n Opción 5: Mostrar en orden PostOrden")
                .append("\n Opción 6: Salir\n");
        System.out.println(sB);
        entradaOpcion();
    }


    // método que da funcionalidad al menú
    public void entradaOpcion() {

        int opcion = entrada.nextInt();

        while (opcion >= 1 || opcion < 6) {
            switch (opcion) {
                case 1:
                    //Inserta un carro
                    carroInfo();
                    System.out.println("Ingresando Carro");
                    break;

                case 2:
                    //Borrar un carro por número de placa
                    System.out.println("Ingrese un número de placa para borrar un carro");
                    int placaABorrar = entrada.nextInt();
                    borrado(raiz,placaABorrar);
                    //System.out.println("Borrando Carro");
                    break;
                case 3:
                    //Preorden
                    System.out.println("Haciendo el recorrido en preorden");
                    preOrder(raiz);
                    break;
                case 4:
                    //Enorden
                    System.out.println("Haciendo el recorrido enorden");
                    inOrder(raiz);
                    break;
                case 5:
                    //PostOrden
                    System.out.println("Haciendo el recorrido en postorden");
                    postOrder(raiz);
                    break;
            }

            // si la entrada 6 sale completamente
            if(opcion == 6) {
                System.out.println("HA SALIDO DEL MENÚ");
                break;
            }
            System.out.println("\n| | | INGRESE OTRA OPCIÓN | | | "
                    + "\n Opción 1: Agregar un carro"
                    + "\n Opción 2: Eliminar un carro "
                    + "\n Opción 3: Mostrar en orden PreOrden "
                    + "\n Opción 4: Mostrar en orden EnOrden "
                    + "\n Opción 5: Mostrar en orden PostOrden"
                    + "\n Opción 6: Salir\n");
            opcion = entrada.nextInt();
        }
    }

    // método que permite ingresarle los atributos al Carro
    public void carroInfo() {
        entrada.nextLine();

        System.out.println("Ingrese un id o placa para el carro");
        int idPlaca = entrada.nextInt();
        System.out.println("idPlaca es: " + idPlaca + "\n");

        System.out.println("Ingrese el modelo del carro ");
        String modelo = entrada.next();
        System.out.println("Modelo: " + modelo + "\n");

        System.out.println("Ingrese el año del carro ");
        int year = entrada.nextInt();
        System.out.println("El año del carro es:" + year + "\n");

        System.out.println("Ingrese el color del carro ");
        String color = entrada.next();
        System.out.println("El color del carro es: " + color + "\n");

        Carro carro = new Carro(idPlaca, modelo, year, color);
        insertar(carro);
    }

    //métodos insert y insertCarro insertan de manera ordena los carros al árbol
    public void insertar(Carro carro){
        if (this.raiz == null){
            this.raiz = carro;
        } else {
            this.insertarCarro(this.raiz, carro);
        }
    }

    private void insertarCarro(Carro raiz, Carro carro){
        if (raiz.idPlaca > carro.idPlaca){
            if (raiz.izquierdo == null){
                raiz.izquierdo = carro;
            } else {
                this.insertarCarro(raiz.izquierdo, carro);
            }
        } else {
            if (raiz.derecho == null){
                raiz.derecho = carro;
            } else {
                this.insertarCarro(raiz.derecho, carro);
            }
        }
    }

    //Métodos para borrar un carro del árbol

    public Carro borrado(Carro raiz, int IdBorrar){
        if(raiz == null)
            return raiz;

        if(IdBorrar < raiz.idPlaca)
            raiz.izquierdo = borrado(raiz.izquierdo,IdBorrar);

        if(IdBorrar > raiz.idPlaca)
            raiz.derecho = borrado(raiz.derecho, IdBorrar);

        if(raiz.izquierdo == null){
            Carro prestado = raiz.derecho;
            raiz = null;
            return prestado;
        }

        if(raiz.derecho == null){
            Carro prestado = raiz.izquierdo;
            raiz = null;
            return prestado;
        }

        Carro prestado = minValue(raiz.derecho);
        raiz.idPlaca = prestado.idPlaca;
        raiz.derecho = borrado(raiz.derecho, prestado.idPlaca);

        return raiz;
    }

    public Carro minValue(Carro raiz){
        Carro actual = raiz;

        while(actual != null && actual.izquierdo != null){
            actual = actual.izquierdo;
        }

        return actual;
    }

    public void preOrder(Carro carro) {
        if (carro == null) {
            return;
        } else {
            System.out.println(carro);
            preOrder(carro.getIzquierdo());
            preOrder(carro.getDerecho());
        }

    }

    // método para recorrer el árbol en postOrden
    public void postOrder(Carro carro) {
        if (carro == null) {
            return;
        } else {
            postOrder(carro.getIzquierdo());
            postOrder(carro.getDerecho());
            System.out.println(carro);
        }
    }

    // método para recorrer el árbol en inOrden
    public void inOrder(Carro carro) {
        if (carro == null) {
            return;
        } else {
            inOrder(carro.getIzquierdo());
            System.out.println(carro);
            inOrder(carro.getDerecho());
        }
    }


/*
    // método que busca un nodo con la llave pasada por parámetro
    public void searchKey(int llave){
        Carro buscador = raiz;

        boolean encontrado = false;

        while (buscador.getIdPlaca() != llave && !encontrado){

            if(llave == buscador.getIdPlaca()) {
                System.out.println("Carro encontrado:\n" + raiz.toString());
                encontrado = true;
                break;
            }


            // se procede a buscar en un ABS
            if(llave < raiz.getIdPlaca()) {
                buscador = buscador.getIzquierdo();
            }
             else
                 buscador = buscador.getDerecho();
        }

        // si no encuentra el nodo a buscar
        if(isEmpty(buscador) && !encontrado)
            System.out.println("No se encontró");

    }


    // método de utilidad para verificar si un árbol está vacío
    private boolean isEmpty(Carro carro) {
        if (carro == null)
            return true;
        else
            return false;

    }


 */
}