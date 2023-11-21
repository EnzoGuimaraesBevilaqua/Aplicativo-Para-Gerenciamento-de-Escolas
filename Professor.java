package administracaoEscolar;

public class Professor extends Pessoa{
    
    String disciplinaLecionada;
    
    Professor(String nome, String identificacao, String dataInicio, String disciplinaLecionada)
    {
        this.nome = nome;
        this.identificacao = identificacao;
        this.dataInicio = dataInicio;
        this.disciplinaLecionada = disciplinaLecionada;
    }
    
    @Override
    public void exibirInformacoes()
    {
        System.out.println("Professor: " + this.nome);
        System.out.println("ID do professor: " + this.identificacao);
        System.out.println("Data de contratacao do professor: " + this.dataInicio);
        System.out.println("Disciplina lecionada pelo professor: " + this.disciplinaLecionada);
    }
}
