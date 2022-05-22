package aps.src.padroesDeProjeto.formularioJava;

public interface ItemForm {

    void addTitulo (String titulo);
    void addSubtitulo (String subtitulo);
    void addDescricao (String descricao);
    void editTitulo (String titulo);
    void editSubtitulo (String subtitulo);
    void editDescricao (String descricao);
    void delTitulo (String titulo);
    void delSubtitulo (String subtitulo);
    void delDescricao (String descricao);
    String searchTitulo(String titulo);
    String searchSubtitulo(String subtitulo);
    String searchDescricao(String descricao);

}
