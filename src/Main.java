import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao da mentoria");
        mentoria.setData(LocalDate.now());



       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("descricção java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devDemerval  = new Dev();
        devDemerval.setNome("Demerval");
        devDemerval.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Demerval" + devDemerval.getConteudoInscrito());
        devDemerval.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos Demerval" + devDemerval.getConteudoInscrito());
        System.out.println("conteudos concluidos Demerval" + devDemerval.getConteudoConcluido());
        System.out.println("XP" + devDemerval.calcularTotalXP());

        System.out.println("---------------------");

        Dev devWesley = new Dev();
        devWesley.setNome("Wesley");
        devWesley.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Wesley" + devWesley.getConteudoInscrito());
        devWesley.progredir();
        devWesley.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos Wesley" + devWesley.getConteudoInscrito());
        System.out.println("conteudos concluidos Wesley" + devWesley.getConteudoConcluido());
        System.out.println("XP " + devWesley.calcularTotalXP());






    }
}
