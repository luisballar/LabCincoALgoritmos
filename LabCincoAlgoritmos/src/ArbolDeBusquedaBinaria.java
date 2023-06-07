public class ArbolDeBusquedaBinaria {
    private Carro raiz;












    public void preOrder(int llave, Carro carro){
        if(isEmpty()) {
            System.out.println("No hay elementos");
        }else{
            if(raiz.getIdPlaca() == llave){
                System.out.println(raiz.toString());
            }
            preOrder(llave, carro.getIzquierdo());
            if(carro.izquierdo.getIdPlaca() == llave ){
                System.out.println(carro.izquierdo.toString());
            }
            preOrder(llave, carro.getDerecho());

        }

    }


    private boolean isEmpty(){
        if(raiz == null)
            return true;
        else
            return false;

    }






}
