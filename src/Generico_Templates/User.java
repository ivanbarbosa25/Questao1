
package Generico_Templates;

/*
 * @author Ivandro
 */

public class User {
    
    private String nome;
    private int idade;
    private String país;
    private String cidade;

    public User() {
    }

    public User(String nome,int idade,String país,String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.país = país;
        this.cidade = cidade;
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + ", " +
               "Idade: " + this.getIdade() + ", "+
               "País: " + this.getPaís() + ", "+
               "Cidade: " + this.getCidade() + ",";
    }
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

    
    public String getPaís() {
        return país;
    }
    public void setPaís(String país) {
        this.país = país;
    }

    
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    

    
}
