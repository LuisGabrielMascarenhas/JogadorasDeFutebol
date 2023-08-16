package br.com.etecia.myapp;

public class Jogadoras {
    private String nome;
    private String titulo;
    private String times;
    private String posicao;
    private int imagem;

    public Jogadoras(String nome, String titulo, String times, String posicao, int imagem) {
        this.nome = nome;
        this.titulo = titulo;
        this.times = times;
        this.posicao = posicao;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}

