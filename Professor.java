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
}