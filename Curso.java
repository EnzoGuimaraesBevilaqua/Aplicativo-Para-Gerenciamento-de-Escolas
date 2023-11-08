package administracaoEscolar;

import java.util.ArrayList;

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
    
    void gerarRelatorio()
    {
        int i = 0;
        double media = 0;
        
        for(Aluno a: alunosInscritos)
        {
            System.out.println("Aluno: " + a.nome);
            System.out.println("Nota 1: " + a.notas.get(i));
            media += a.notas.get(i)/alunosInscritos.size();
            i++;
            System.out.println("Nota 2: " + a.notas.get(i) + "\n");
            media += a.notas.get(i)/alunosInscritos.size();
        }
        
        System.out.println("Media da turma: " + media);
        // Ainda sem desvio padrao
    }
}