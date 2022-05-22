public class Main {
    public static void main(String args[]){
        IVet  vet = new Vet();
        Aluno aluno = new Aluno("João", 20, 9.9);
        
        vet.adiciona("Vetor Genérico");
        vet.adiciona(5.987);
        vet.adiciona(aluno);
        
        vet.imprime();
    }
    
}