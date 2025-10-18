package administracaoEscolar;

import java.util.ArrayList;

public class Escola {
    
    Diretor diretor;
    ArrayList<Curso> cursos;
    String nomeEscola;
    String endereco;
    String identificacaoEscola;
    String anoFundacao;
    
    Escola(String nomeEscola, String endereco, String identificacaoEscola, String anoFundacao, String nomeDiretor, String identificacaoDiretor, String dataDiretor)
    {
        cursos = new ArrayList<>();
        diretor = new Diretor(nomeDiretor, identificacaoDiretor, dataDiretor);
        this.nomeEscola = nomeEscola;
        this.endereco = endereco;
        this.identificacaoEscola = identificacaoEscola;
        this.anoFundacao = anoFundacao;
    }
    
    public String exibirInformacoes()
    {
        String t = "";
        
        t += "Nome da escola: " + this.nomeEscola + "\n";
        t += "Endereco da escola: " + this.endereco + "\n";
        t += "ID da escola: " + this.identificacaoEscola + "\n";
        t += "Ano de fundacao da escola: " + this.anoFundacao + "\n";
        
        return t;
    }
}