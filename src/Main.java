import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }

}
