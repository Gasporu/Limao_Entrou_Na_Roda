import java.util.Random;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(int idade) {
        this.idade = idade;
        this.nome = gerarNomeAleatorio();
    }
    
    private String gerarNomeAleatorio() {
        String[] nomes = {"João", "Maria", "Pedro", "Ana", "Carlos", "Marcia", "Fernando", "Mariana",
        		"Roberto","Willian","Geraldo","Samara","Eduarda","Bruno","Kaua","Ozzy","Lorenzo"};
        Random random = new Random();
        int indice = random.nextInt(nomes.length);
        return nomes[indice];
    }
    
    
    
    public void setNome(String nome) {
		this.nome = nome;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    
    
    @Override
    public String toString() {
        return "Ganhador(a): " + nome + " " + idade + " anos";
    }
}

