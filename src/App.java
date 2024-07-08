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

// Classe concreta PessoaFisica
class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getInfo() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}

// Classe concreta PessoaJuridica
class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getInfo() {
        return "Nome: " + nome + ", CNPJ: " + cnpj;
    }
}

// Classe principal para testar as classes
public class App {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João Silva", "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Empresa X", "12.345.678/0001-00");

        System.out.println(pf.getInfo());
        System.out.println(pj.getInfo());
    }
}
