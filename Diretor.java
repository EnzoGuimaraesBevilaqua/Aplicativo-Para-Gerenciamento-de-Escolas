package administracaoEscolar;

public class Diretor extends Pessoa{
    
    Diretor(String nome, String identificacao, String dataInicio)
    {
        this.nome = nome;
        this.identificacao = identificacao;
        this.dataInicio = dataInicio;
    }
    
    @Override
    public void exibirInformacoes()
    {
        System.out.println("Diretor: " + this.nome);
        System.out.println("ID do diretor: " + this.identificacao);
        System.out.println("Data de contratacao do diretor: " + this.dataInicio);
    }
}
