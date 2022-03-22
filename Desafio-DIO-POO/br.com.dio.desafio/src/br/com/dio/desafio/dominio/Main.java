package br.com.dio.desafio.dominio;

import org.w3c.dom.CDATASection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição, Curso java");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição, Curso js");
        curso2.setCargaHoraria(7);

        Conteudo Conteudo = new Curso();
        Conteudo Conteudo1 = new Mentoria();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Js");
        mentoria1.setDescricao("Descrição, JS");
        mentoria1.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devHenrique = new Dev();
        devHenrique.setNome("Henrique");
        devHenrique.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devHenrique.getConteudosInscritos());
        devHenrique.progredir();
        System.out.println("Conteúdos Inscritos" + devHenrique.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devHenrique.getConteudosConcluidos());
        System.out.println("Xp: " + devHenrique.calcularXp());

    }
}
