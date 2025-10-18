package administracaoEscolar;

import java.util.ArrayList;
import java.lang.Math;

public class Curso {
    
    ArrayList<Professor> professores;
    ArrayList<Aluno> alunosInscritos;
    String nomeCurso;
    String codigo;
    String descricao;
    String anoInicio;
    
    Curso(String nomeCurso, String codigo, String descricao, String anoInicio)
    {
        professores = new ArrayList<>();
        alunosInscritos = new ArrayList<>();
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
        this.descricao = descricao;
        this.anoInicio = anoInicio;
    }
    
    public String gerarRelatorio()
    {
        int i = 0;
        double media = 0;
        double soma = 0;
        String t = "";
        
        t += "Curso: " + this.nomeCurso + "\n";
        t += "Codigo do curso: " + this.codigo + "\n";
        t += "Descricao do curso: " + this.descricao + "\n";
        t += "Ano de inicio do curso: " + this.anoInicio + "\n";
        
        for(Aluno a: alunosInscritos)
        {
            t += "Aluno: " + a.nome + "\n";
            t += "Nota 1: " + a.notas.get(i) + "\n";
            media += a.notas.get(i)/alunosInscritos.size();
            i++;
            t += "Nota 2: " + a.notas.get(i) + "\n";
            media += a.notas.get(i)/alunosInscritos.size();
            i--;
        }
        
        t += "Media da turma:" + media + "\n";
        
        for(Aluno a: alunosInscritos)
        {
            soma += a.notas.get(i) - media;
            i++;
            soma += a.notas.get(i) - media;
            i--;
        }
        
        t += "Desvio padrao da turma: " + Math.sqrt((soma*soma)/alunosInscritos.size()) + "\n\n";
        
        return t;
    }
    
    public String exibirAlunos()
    {
        String t = "";
        
        for(Aluno a: alunosInscritos)
        {
            t += "Nome: " + a.nome + "\n";
            t += "Matricula: " + a.identificacao + "\n";
            t += "Data de Admissao: " + a.dataInicio + "\n";
            t += "Serie: " + a.serie + "\n\n";
        }
        
        return t;
    }
    
    public String exibirProfessores()
    {
        String t = "";
        
        for(Professor p: professores)
        {
            t += "Nome: " + p.nome + "\n";
            t += "Identificacao: " + p.identificacao + "\n";
            t += "Data de Contratacao: " + p.dataInicio + "\n";
            t += "Disciplina Lecionada: " + p.disciplinaLecionada + "\n\n";
        }
        
        return t;
    }
}