/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastraralunos;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class CadastrarAlunos {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       
       
       System.out.println("Informe o nome do primeiro aluno: ");
       String nome = ler.next();
       System.out.println("Informe o cpf do primeiro aluno" );
       int cpf = ler.nextInt();
       System.out.println("Informe a idade do primeiro aluno: ");
       int idade = ler.nextInt();
       System.out.println("Informe o telefone o primeiro aluno");
       int telefone = ler.nextInt();
       System.out.println("Informe o email do primeiro aluno: ");
       String email = ler.next();
       
       
       Aluno alunoNovo1 = new Aluno (nome, cpf, idade, telefone, email);
       
       alunoNovo1.setNome(nome);
       alunoNovo1.setCpf(cpf);
       alunoNovo1.setIdade(idade);
       alunoNovo1.setTelefone(telefone);
       alunoNovo1.setEmail(email);
       
       Turma turma1 = new Turma(alunoNovo1);
       
       System.out.println("Insira o número da Sala: ");
       int numSala = ler.nextInt();
       
       System.out.println("Insira o horário da sala de aula: ");
       int horario = ler.nextInt();
       
       System.out.println("Quantas vagas tem na sala de aula: ");
       int vagas = ler.nextInt();
       
       System.out.println("Qual é sala que ele vai estudar: ");
       String sala = ler.next();
       
       turma1.setNumSala(numSala);
       turma1.setHorario(horario);
       turma1.setVagas(vagas);
       turma1.setSala(sala);
       
       if(!"".equals(alunoNovo1.getNome())){
        System.out.println("Aluno encontrado");
        }
        else{
        System.out.println("Aluno não encontrado");
                }
    
    
       
       
       Aluno alunoNovo2 = new Aluno (nome, cpf, idade, telefone, email);
       
       System.out.println("Informe o nome do segundo aluno: ");
       nome = ler.next();
       System.out.println("Informe o cpf do segundo aluno" );
       cpf = ler.nextInt();
       System.out.println("Informe a idade do segundo aluno: ");
       idade = ler.nextInt();
       System.out.println("Informe o telefone do segundo aluno");
       telefone = ler.nextInt();
       System.out.println("Informe o email do segundo aluno: ");
       email = ler.next();
       
       alunoNovo2.setNome(nome);
       alunoNovo2.setCpf(cpf);
       alunoNovo2.setIdade(idade);
       alunoNovo2.setTelefone(telefone);
       alunoNovo2.setEmail(email);
       
       Turma turma2 = new Turma(alunoNovo2);
       
       System.out.println("Insira o número da Sala: ");
       numSala = ler.nextInt();
       
       System.out.println("Insira o horário da sala de aula: ");
       horario = ler.nextInt();
       
       System.out.println("Quantas vagas tem na sala de aula: ");
       vagas = ler.nextInt();
       
       System.out.println("Qual é sala que ele vai estudar: ");
       sala = ler.next();
       
       turma2.setNumSala(numSala);
       turma2.setHorario(horario);
       turma2.setVagas(vagas);
       turma2.setSala(sala);
       
       
       if(!"".equals(alunoNovo2.getNome())){
        System.out.println("Aluno encontrado");
        }
        else{
        System.out.println("Aluno não encontrado");
                }
       
       
       
       
       
        Aluno alunoNovo3 = new Aluno (nome, cpf, idade, telefone, email);
       
       System.out.println("Informe o nome do terceiro aluno: ");
       nome = ler.next();
       System.out.println("Informe o cpf do terceiro aluno" );
       cpf = ler.nextInt();
       System.out.println("Informe a idade do terceiro aluno: ");
       idade = ler.nextInt();
       System.out.println("Informe o telefone do terceiro aluno");
       telefone = ler.nextInt();
       System.out.println("Informe o email do terceiro aluno: ");
       email = ler.next();
       
       alunoNovo3.setNome(nome);
       alunoNovo3.setCpf(cpf);
       alunoNovo3.setIdade(idade);
       alunoNovo3.setTelefone(telefone);
       alunoNovo3.setEmail(email);
       
       Turma turma3 = new Turma(alunoNovo1);
       
       System.out.println("Insira o número da Sala: ");
       numSala = ler.nextInt();
       
       System.out.println("Insira o horário da sala de aula: ");
       horario = ler.nextInt();
       
       System.out.println("Quantas vagas tem na sala de aula: ");
       vagas = ler.nextInt();
       
       System.out.println("Qual é sala que ele vai estudar: ");
       sala = ler.next();
       
       turma3.setNumSala(numSala);
       turma3.setHorario(horario);
       turma3.setVagas(vagas);
       turma3.setSala(sala);
       
       if(!"".equals(alunoNovo1.getNome())){
        System.out.println("Aluno encontrado");
        }
        else{
        System.out.println("Aluno não encontrado");
                }
       
       
                }
    
    
    }

