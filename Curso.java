package administracaoEscolar;

import java.util.ArrayList;
import java.lang.Math;

public class Curso {
    
    Professor professor;
    ArrayList<Aluno> alunosInscritos;
    String nomeCurso;
    String codigo;
    String descricao;
    String anoInicio;
    
    Curso(String nomeCurso, String codigo, String descricao, String anoInicio)
    {
        alunosInscritos = new ArrayList<>();
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
        this.descricao = descricao;
        this.anoInicio = anoInicio;
    }
    
    public void gerarRelatorio()
    {
        int i = 0;
        double media = 0;
        double soma = 0;
        
        for(Aluno a: alunosInscritos)
        {
            System.out.println("Aluno: " + a.nome);
            System.out.println("Nota 1: " + a.notas.get(i));
            media += a.notas.get(i)/alunosInscritos.size();
            i++;
            System.out.println("Nota 2: " + a.notas.get(i) + "\n");
            media += a.notas.get(i)/alunosInscritos.size();
            i--;
        }
        
        System.out.println("Media da turma: " + media);
        
        for(Aluno a: alunosInscritos)
        {
            soma += a.notas.get(i) - media;
            i++;
            soma += a.notas.get(i) - media;
            i--;
        }
        
        System.out.println("Desvio padrao da turma: " + Math.sqrt((soma*soma)/alunosInscritos.size()));
    }
    
    public void exibirInformacoes()
    {
        System.out.println("Curso: " + this.nomeCurso);
        System.out.println("Professor responsavel: " + this.professor.nome);
        System.out.println("Codigo do curso: " + this.codigo);
        System.out.println("Descricao do curso: " + this.descricao);
        System.out.println("Ano de inicio do curso: " + this.anoInicio);
    }
}
