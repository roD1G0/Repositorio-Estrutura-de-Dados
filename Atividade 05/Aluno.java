public class Aluno {
    private String nome;
    private int idade;
    private double nota;
   public Aluno(String nome, int idade, double nota){
       this.nome = nome;
       this.idade = idade;
       this.nota = nota;
   }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + ", nota=" + nota + '}';
    }
   
}