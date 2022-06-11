public class Vet implements IVet{
    private Object[] objs = new Object[4];
    private int totalObj = 0;
    
    public void adiciona(Object obj){
        if(!this.cheio()){
            this.objs[totalObj] = obj;
        totalObj++;
        }else
            System.out.println("Vetor cheio!");
    }
    public int tamanho(){
        return this.totalObj;
    }
    public boolean contem(Object obj){
        for(int i = 0; i < this.totalObj; i++){
            if(obj == this.objs[i])
                return true;
        }
        return false;
    }
    public boolean cheio(){
        if(totalObj == this.objs.length)
            return true;
        return false;
    }
    private void garanteEspaco(){
        if(this.cheio()){
            Object[] novosObjs = new Object[this.objs.length * 2];
            for(int i = 0; i < this.objs.length; i++)
                novosObjs[i] = this.objs[i];
            this.objs = novosObjs;
        }
    }
    public boolean remove(Object obj){
        int indice = -1;
        for (int i = 0; i < totalObj; i++)
            if(obj == this.objs[i]){
                indice = i; break;}
        if(indice != -1){
            for(int i = indice; i < (totalObj-1); i++)
                this.objs[i] = this.objs[i-1];
            totalObj--;
            return true;
        }
        return false;
    }
    
    public void imprime(){
        for(int i = 0;i < totalObj; i++){
            System.out.println(this.objs[i].toString()+"\n");
        }
    }
}