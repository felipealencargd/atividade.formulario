package aps.src.padroesDeProjeto.formularioJava;

import java.util.ArrayList;
import java.util.List;

public class ItemFormComposto implements ItemForm {

    List<Secao> secoes = new ArrayList<Secao>();
    List<Imagem> imagens = new ArrayList<Imagem>();
    List<Video> videos = new ArrayList<Video>();
    List<Pergunta> perguntas = new ArrayList<Pergunta>();

    private String titulo;
    private String subtitulo;
    private String descricao;

    public ItemFormComposto (String titulo, String subtitulo, String descricao){
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.descricao = descricao;
    }

    public void criarSecao(String titulo, String subtitulo, String descricao){
        Secao secao = new Secao(titulo, subtitulo, descricao);
        this.secoes.add(secao);
    }

    public void excluirSecao(Secao secao){
        this.secoes.remove(secao);
    }

    public void moverSecao (Secao secao, int posicao){
        this.secoes.add(posicao, secao);
    }

    public void duplicarSecao (Secao secao){
        if (this.secoes.contains(secao)){
            this.secoes.add(secao);
        } else {
            System.err.println("Não foi possível duplicar a seção, visto que ela não existe.");
        }
    }

    public void addPergunta (Pergunta pergunta){
        this.perguntas.add(pergunta);
    }

    public void importarPergunta (Pergunta pergunta){
        this.addPergunta(pergunta);
    }

    public void addImagem(Imagem i){
        this.imagens.add(i);
    }

    public void addVideo (Video v){
        this.videos.add(v);
    }

    public void deletePergunta (Pergunta p){
        this.perguntas.remove(p);
    }

    public void deleteImagem (Imagem i){
        this.imagens.remove(i);
    }

    public void deleteVideo(Video v){
        this.videos.remove(v);
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

}
