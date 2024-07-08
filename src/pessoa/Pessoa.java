package pessoa;

// Classe abstrata Pessoa
abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método abstrato para obter informações específicas da pessoa
    public abstract String getInfo();
}
