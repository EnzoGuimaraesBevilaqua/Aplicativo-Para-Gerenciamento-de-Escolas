package administracaoEscolar;

import java.util.Scanner;
import java.util.ArrayList;

public class Aplicacao {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Escola> escolas = new ArrayList<>();
        int opcao;
        String nome;
        String endereco;
        String identificacao;
        String descricao;
        String disciplina;
        String data;
        String serie;
        int i = 0;
        
        while(true)
        {
            System.out.println("1- Cadastrar escola");
            System.out.println("2- Consultar dados");
            System.out.println("3- Sair");
            opcao = input.nextInt();
            nome = input.nextLine();
            
            if(opcao == 1)
            {
                //Cadastro da escola###########################
                System.out.println("Insira o nome da escola");
                nome = input.nextLine();
                
                System.out.println("Insira o endereco da escola");
                endereco = input.nextLine();
                
                System.out.println("Insira a identificacao da escola");
                identificacao = input.nextLine();
                
                System.out.println("Insira o ano de fundacao da escola");
                data = input.nextLine();
                
                escolas.add(new Escola(nome, endereco, identificacao, data));
                
                //Cadastro do diretor#####################################
                System.out.println("Insira o nome do diretor da escola");
                nome = input.nextLine();
                
                System.out.println("Insira o ID do diretor da escola");
                identificacao = input.nextLine();
                
                System.out.println("Insira a data de contratacao do diretor da escola");
                data = input.nextLine();
                
                escolas.get(i).diretor = new Diretor(nome, identificacao, data);
                
                //Cadastro do curso###########################
                System.out.println("Insira o nome do curso");
                nome = input.nextLine();
                
                System.out.println("Insira a identificacao do curso");
                identificacao = input.nextLine();
                
                System.out.println("Insira a descricao do curso");
                descricao = input.nextLine();
                
                System.out.println("Insira a data de inincio do curso");
                data = input.nextLine();
                
                escolas.get(i).cursos.add(new Curso(nome, identificacao, descricao, data));
                
                //Cadastro do professor do curso###########################
                System.out.println("Insira o nome do professor do curso");
                nome = input.nextLine();
                
                System.out.println("Insira a identificacao do professor do curso");
                identificacao = input.nextLine();
                
                System.out.println("Insira a data de contratacao do professor do curso");
                data = input.nextLine();
                
                System.out.println("Insira a disciplina lecionada pelo professor do curso");
                disciplina = input.nextLine();
                
                escolas.get(i).cursos.get(i).professor = new Professor(nome, identificacao, data, disciplina);
                
                //Cadastro do aluno do curso####################
                System.out.println("Insira um aluno ao curso");
                nome = input.nextLine();
                
                System.out.println("Insira a matricula do aluno");
                identificacao = input.nextLine();
                
                System.out.println("Insira a data de entrada do aluno");
                data = input.nextLine();
                
                System.out.println("Insira a serie do aluno");
                serie = input.nextLine();
                
                escolas.get(i).cursos.get(i).alunosInscritos.add(new Aluno(nome, identificacao, data, serie));
                
                //Teste de entrada de dados################################################################
                //Ate agora, tudo foi corretamente registrado, mas as entradas que eu usei sao bem simples
                //Isso vai ter que estar em alguma funcao
                System.out.println("\nNome da escola: " + escolas.get(i).nomeEscola);
                System.out.println("Endereco da escola: " + escolas.get(i).endereco);
                System.out.println("ID da escola: " + escolas.get(i).identificacaoEscola);
                System.out.println("Ano de fundacao da escola: " + escolas.get(i).anoFundacao);
                System.out.println("Diretor: " + escolas.get(i).diretor.nome);
                System.out.println("ID do diretor: " + escolas.get(i).diretor.identificacao);
                System.out.println("Data de contratacao do diretor: " + escolas.get(i).diretor.dataInicio);
                System.out.println("Cursos");
                System.out.println("Curso 1: " + escolas.get(i).cursos.get(i).nomeCurso);
                System.out.println("Codigo do curso: " + escolas.get(i).cursos.get(i).codigo);
                System.out.println("Descricao do curso: " + escolas.get(i).cursos.get(i).descricao);
                System.out.println("Ano de inicio do curso: " + escolas.get(i).cursos.get(i).anoInicio);
                System.out.println("Professor do curso: " + escolas.get(i).cursos.get(i).professor.nome);
                System.out.println("ID do professor: " + escolas.get(i).cursos.get(i).professor.identificacao);
                System.out.println("Data de contratacao do professor: " + escolas.get(i).cursos.get(i).professor.dataInicio);
                System.out.println("Disciplina lecionada pelo professor: " + escolas.get(i).cursos.get(i).professor.disciplinaLecionada);
                System.out.println("Alunos inscritos no curso");
                System.out.println("Nome do aluno: " + escolas.get(i).cursos.get(i).alunosInscritos.get(i).nome);
                System.out.println("Matricula do aluno: " + escolas.get(i).cursos.get(i).alunosInscritos.get(i).identificacao);
                System.out.println("Data de entrada do aluno: " + escolas.get(i).cursos.get(i).alunosInscritos.get(i).dataInicio);
                System.out.println("Serie do aluno: " + escolas.get(i).cursos.get(i).alunosInscritos.get(i).serie);
                i++;
            }
            else if(opcao == 2)
            {
                //O usuario pesquisa o nome da escola e acessa os dados
            }
            else if(opcao == 3)
            {
                break;
            }
        }
        input.close();
    }
}