public class ArbolDeBusquedaBinaria {


    public void preOrder(Carro carro){
        if(isEmpty(carro)) {
            System.out.println("No hay elementos");
        }else{
            System.out.println(carro);
            preOrder(carro.getIzquierdo());
            preOrder(carro.getDerecho());
        }

    }

    public void postOrder(Carro carro){
        if (isEmpty(carro)) {
            System.out.println("No hay elementos");
        }else{
            postOrder(carro.getIzquierdo());
            postOrder(carro.getIzquierdo());
            System.out.println(carro);
        }

    }

    public void inOrder(Carro carro){
        if(isEmpty(carro)){
            System.out.println("No hay elementos");
        }else{
            inOrder(carro.getIzquierdo());
            System.out.println(carro);
            inOrder(carro.getDerecho());
        }
    }

    private boolean isEmpty(Carro carro){
        if(carro == null)
            return true;
        else
            return false;

    }

}

