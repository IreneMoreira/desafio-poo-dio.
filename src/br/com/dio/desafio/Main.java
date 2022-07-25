package br.com.dio.desafio;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso de js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição Bootcamp Java Developer");
        mentoria.setData(localDate.now());

       System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIrene = new Dev();
        devIrene.setNome("Irene");
        devIrene.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Irene" + devIrene.getConteudoInscrito());
        devIrene.progredir();
        devIrene.progredir();
        devIrene.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos Irene" + devIrene.getConteudoConcluido());
        System.out.println("XP:" + devIrene.calcularTotalXp());

        System.out.println("---------");

        Dev devGelson = new Dev();
        devGelson.setNome("Gelson");
        devGelson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Gelson" + devGelson.getConteudoInscrito());
        devGelson.progredir();
        devGelson.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos Gelson" + devGelson.getConteudoConcluido());
        System.out.println("XP:" + devGelson.calcularTotalXp());

    }
}
