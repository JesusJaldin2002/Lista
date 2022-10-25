package Preg2;

public class Lista {
    private Nodo L;
    private int n;
    
    public Lista(){
        L = null;
        n = 0;
    }
      
    
    public void dec(int ID, int c){     //Pregunta 2
       Nodo p = L;
       Nodo ant = null;
    
       while (p!=null){
            if (IndexOf(p.Data)==0){
            if (p.Data==ID){
            p.Link.Data=p.Link.Data-c;
            if (p.Link.Data<=0){
                L=p.Link.Link;
            }
           }
       }
            else {
    
               if ((IndexOf(p.Data) % 2)==0){
                   if(p.Data==ID){
                   p.Link.Data=p.Link.Data-c;
                   if(p.Link.Data<=0){
                   ant.Link=p.Link.Link;         
                   }
                   }
               }
            } 
            ant = p;
            p=p.Link;
      
       }
    }
    
    
    void add(int ID, int valor){ 
       if (L==null)
           L=new Nodo(ID);
       else
           addLast(ID);
       
       addLast(valor);
    }
    
    public int IndexOf(int x){
        Nodo p=L;
        int c = 0;
        while (p!=null){
            if (p.Data==x)
            {
            return c;
            }
            p=p.Link;
            c++;
        }
        return -1;
    }
    
    @Override
    public String toString(){ 
        String S = "[";
        String coma="";
       
        int i=0;
        Nodo p  = L;
        while (p != null){
            S += coma + p.getData();
            coma=(i==0 ? ",": ", ");
            p = p.getLink();
            i=1-i;
        }
       
       return S+"]";
    }
    
    private void addLast(int x){    //Pre: Lista no vacía y x no existe en la Lista
        Nodo p=L;
        while (p.getLink() != null)
            p=p.getLink();
        
        p.setLink( new Nodo(x) );
        n++;
    }
}
