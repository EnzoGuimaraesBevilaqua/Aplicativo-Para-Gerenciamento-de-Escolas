package administracaoEscolar;

import java.util.ArrayList;

public class Escola {
    
    Diretor diretor;
    ArrayList<Curso> cursos;
    String nomeEscola;
    String endereco;
    String identificacaoEscola;
    String anoFundacao;
    
    Escola(String nomeEscola, String endereco, String identificacaoEscola, String anoFundacao)
    {
        cursos = new ArrayList<>();
        this.nomeEscola = nomeEscola;
        this.endereco = endereco;
        this.identificacaoEscola = identificacaoEscola;
        this.anoFundacao = anoFundacao;
    }
    
    public void exibirInformacoes()
    {
        System.out.println("\nNome da escola: " + this.nomeEscola);
        System.out.println("Endereco da escola: " + this.endereco);
        System.out.println("ID da escola: " + this.identificacaoEscola);
        System.out.println("Ano de fundacao da escola: " + this.anoFundacao);
    }
}
