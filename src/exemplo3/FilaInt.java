package exemplo3;

public class FilaInt {
    private class NO{
        int dado;
        NO prox;
    }

    private NO ini, fim;

    public void init(){
        ini = null;
        fim = null;
    }

    public boolean isEmpty(){
        return (ini == null && fim==null);
    }

    public void enqueue(int elem){
        NO novo = new NO();
        novo.dado = elem;
        novo.prox = null;
        if(isEmpty()){
            ini = novo;
        } else {
            fim.prox = novo;
        }

    }
}
