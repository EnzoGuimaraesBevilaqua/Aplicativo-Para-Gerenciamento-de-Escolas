package administracaoEscolar;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    
    ArrayList<Double> notas;
    String serie;
    
    Aluno(String nome, String identificacao, String dataInicio, String serie)
    {
        notas = new ArrayList<>();
        this.nome = nome;
        this.identificacao = identificacao;
        this.dataInicio = dataInicio;
        this.serie = serie;
    }
    
    @Override
    public void exibirInformacoes()
    {
        System.out.println("Aluno: " + this.nome);
        System.out.println("Matricula: " + this.identificacao);
        System.out.println("Data de entrada: " + this.dataInicio);
        System.out.println("Serie: " + this.serie);
    }
}
