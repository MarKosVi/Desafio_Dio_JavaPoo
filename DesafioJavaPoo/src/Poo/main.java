package Poo;

import java.time.LocalDate;

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
		
		curso1.setTitulo("JavaScript");
		curso1.setDescricao("Curso de desenvolvimento JavaScript");
		curso1.setCargaHoraria(60);
		
		mentoria.setTitulo("Mentoria Poo");
		mentoria.setDescricao("Mentoria de orientacao ao objeto");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso);
		System.out.println(curso1);
		System.out.println(curso1);
		System.out.println(mentoria);
		
		
		
		
	}

}
