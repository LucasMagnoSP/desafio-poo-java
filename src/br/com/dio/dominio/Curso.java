package br.com.dio.dominio;
public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;



    //GETTERS
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getTitulo() {
        return titulo;
    }

    //SETTERS
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
