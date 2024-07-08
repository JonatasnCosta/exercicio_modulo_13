import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;

public class App {
    public static void main(String[] args) {
        
        PessoaFisica pf = new PessoaFisica("João Silva", "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Empresa X", "12.345.678/0001-00");
        
        

        System.out.println(pf.getInfo());
        System.out.println(pj.getInfo());
    }
}
