package bo.edu.uagrm.ficct.inf120.pnatural;

/**
 * Created by Evans on 12/10/16.
 */

public class Natural {
    private int valor;
    public Natural(){
        valor=0;
    }
    public void setValor(int val){
        valor=val;
    }
    public int getValor(){
        return valor;
    }
    public int digCant(){
        int c,dig,aux;
        aux=valor;
        c=0;
        while(aux!=0){
            dig= aux % 10;
            aux= aux / 10;
            c= c + 1;
        }
        return c;
    }
    public void digAdd(int dig){
        valor = (valor * 10) + dig;
    }
}
