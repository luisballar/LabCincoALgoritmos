import java.util.Scanner;

public class ArbolDeBusquedaBinaria {

Carro raiz;
    Scanner entrada = new Scanner(System.in);

ArbolDeBusquedaBinaria(){
    raiz = null;
}

    public void menuPrincipal(){
        StringBuilder sB = new StringBuilder("Menu Principal")
                .append("\n Elija una opción:")
                .append("\n Opción 1: Agregar un carro")
                .append("\n Opción 2: Eliminar un carro ")
                .append("\n Opción 3: Mostrar en orden PreOrden ")
                .append("\n Opción 4: Mostrar en orden EnOrden ")
                .append("\n Opción 5: Mostrar en orden PostOrden")
                .append("\n Opción 6: Salir\n");
        System.out.println(sB.toString());
        entradaOpcion();
    }

    public void entradaOpcion(){
        int opcion = entrada.nextInt();
        while(opcion>=1 || opcion<6){
            switch (opcion){
                case 1:
                    //Insertar un carro
                case 2:
                    //Borrar un carro
                case 3:
                    //Preorden
                case 4:
                    //Enorden
                case 5:
                    //PostOrden

            // si la entrada 6 sale completamente
            if (opcion == 6) {
                System.out.println("HA SALIDO DEL MENÚ");
                break;
            }
            System.out.println("\n| | | INGRESE OTRA OPCIÓN | | | ");
            opcion = entrada.nextInt();
        }
    }

    public void estudianteInfo(){
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
                System.out.println("El color del carro es: " + color  + "\n");

                Carro carro = new Carro(idPlaca, modelo, year, color);
               // append(carro);
            }






    /*
    public void insert(int idPlaca){
        raiz = insertarCarro(raiz, idPlaca);
    }

    Node insertarCarro(Node raiz, int idPlaca){
        if(raiz == null){
            raiz = new Node(idPlaca);
            return raiz;
        }
        if(idPlaca < raiz.idPlaca)
            raiz.izquierdo = insertarCarro(raiz.izquierdo, idPlaca);
        else if (raiz > raiz.idPlaca)) {
            raiz.derecho = insertarCarro(raiz.derecho, idPlaca);
        }
        return raiz;
    }

    */
    }


    }
