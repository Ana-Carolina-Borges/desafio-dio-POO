import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição Curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now()); // atribui data de criacao
/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
*/

        Bootcamp bootcamp =  new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAna = new Dev();
        devAna.setNome("Ana Carolina");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devAna.getConteudosConcruidos());
        System.out.println("XP = " + devAna.calcularXp());

        System.out.println("--------------");


        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devPedro.getConteudosConcruidos());
        System.out.println("XP = " + devPedro.calcularXp());






    }

}
