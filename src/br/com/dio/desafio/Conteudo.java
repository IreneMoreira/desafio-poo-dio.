package br.com.dio.desafio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;
    public double calcularXp;

    private String titulo;
    private String decricao;

        public abstract double calcularXp ();

        public String getTitulo () {
            return titulo;
        }

        public void setTitulo (String titulo){
            this.titulo = titulo;
        }

        public String getDecricao () {
            return decricao;
        }

        public void setDecricao (String decricao){
            this.decricao = decricao;
        }


    public void setDescricao(String descrição_curso_de_java) {
    }
}

