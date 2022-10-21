public class Acampamento {
    private String nome;
    private int idade;
    private char equipe;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public char getEquipe(){
        return equipe;
    }
    
    public void setEquipe(char equipe){
        this.equipe = equipe;
    }

    public Acampamento(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }
    public void definirEquipe(){
        if(this.idade >= 6 && this.idade <= 10){
            setEquipe('A');
        }else if(this.idade >= 11 && this.idade <= 20){
            setEquipe('B');
        }else if(this.idade >= 21){
            setEquipe('C');
        }
    }
    @Override
    public String toString(){
        return "Nome: " + this.nome + ", idade: " + this.idade + " e equipe: " + this.equipe;
    }
}
