package br.com.dio.desafio;

public class Mentoria extends Conteudo{
       private localDate data;

    @Override
    public double calcularXp() { return XP_PADRAO + 20d; }
    public Mentoria() {
    }
    public localDate getData() { return data; }
    public void setData(localDate data) { this.data = data; }
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDecricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
