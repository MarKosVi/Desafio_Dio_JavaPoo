package Poo;

import java.time.LocalDate;

import Modulos.Bootcamp;
import Modulos.Dev;
import Modulos.Curso;
import Modulos.Mentoria;

public class main {

	public static void main(String[] args) {


		Curso curso = new Curso();
		Curso curso1 = new Curso();
		Mentoria mentoria = new Mentoria();
		
		curso.setTitulo("Java");
		curso.setDescricao("Curso de desenvolvimento Java Poo");
		curso.setCargaHoraria(90);
		
		curso1.setTitulo("Logica");
		curso1.setDescricao("Curso de desenvolvimento Logica e programacao");
		curso1.setCargaHoraria(60);
		
		mentoria.setTitulo("Mentoria Poo");
		mentoria.setDescricao("Mentoria de orientacao ao objeto");
		mentoria.setData(LocalDate.now());
		
		Bootcamp javaBootcamp = new Bootcamp();
		javaBootcamp.setNome("Desenvolvimento Java POO");
		javaBootcamp.setDescricao("Curso de desenvolvimento ministrado na linguagem Java");
		javaBootcamp.getConsteudos().add(curso1);
		javaBootcamp.getConsteudos().add(curso);
		javaBootcamp.getConsteudos().add(mentoria);
		
		Dev alunoMarcos = new Dev();
		alunoMarcos.setNome("Marcos");
		
		Dev alunoCamilla = new Dev();
		alunoCamilla.setNome("Camilla");
		
		alunoMarcos.increverBootcamp(javaBootcamp);
		alunoCamilla.increverBootcamp(javaBootcamp);
		
		
		System.out.println("Conteudos Inscrito: "+alunoMarcos.getConteudosInscritos());
		System.out.println("Conteudos Inscrito: "+alunoCamilla.getConteudosInscritos());
		
		System.out.println("\n");
		alunoMarcos.progredir();
		alunoCamilla.progredir();
		alunoCamilla.progredir();
		alunoCamilla.progredir();
		System.out.println("\n");
		
		System.out.println("Conteudos Inscrito: "+alunoMarcos.getConteudosInscritos());
		System.out.println("Conteudos Inscrito: "+alunoCamilla.getConteudosInscritos());
		System.out.println("\n");
		
		System.out.println("Conteudos Concluidos: "+alunoMarcos.getConteudosFinalizados());
		System.out.println("Conteudos Concluidos: "+alunoCamilla.getConteudosFinalizados());
		
		
		
		
		
		
		
		
		
	}

}
