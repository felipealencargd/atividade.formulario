package aps.src.padroesDeProjeto.formularioJava;

public class Pergunta implements ItemForm {

    private String titulo;
    private String subtitulo;
    private String descricao;
    private String resposta;

    public Pergunta (String titulo, String subtitulo, String descricao, String resposta){
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.descricao = descricao;
        this.resposta = resposta;
    }

    @Override
    public void addTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void addSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    @Override
    public void addDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void editTitulo(String titulo) {
        this.addTitulo(titulo);
    }

    @Override
    public void editSubtitulo(String subtitulo) {
        this.addSubtitulo(subtitulo);
    }

    @Override
    public void editDescricao(String descricao) {
        this.addDescricao(descricao);
    }

    @Override
    public void delTitulo(String titulo) {
        this.titulo = null;
    }

    @Override
    public void delSubtitulo(String subtitulo) {
        this.subtitulo = null;
    }

    @Override
    public void delDescricao(String descricao) {
        this.descricao = null;
    }

    @Override
    public String searchTitulo(String titulo) {
        return this.titulo;
    }

    @Override
    public String searchSubtitulo(String subtitulo) {
        return this.subtitulo;
    }

    @Override
    public String searchDescricao(String descricao) {
        return this.descricao;
    }

    public void validadorResposta (ValidadorResposta validadorResposta){
        validadorResposta.validarResposta(this.resposta);
    }

}
