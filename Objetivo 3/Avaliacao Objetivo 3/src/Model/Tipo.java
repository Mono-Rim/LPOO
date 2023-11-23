package Model;

public enum Tipo {

    ATENDIDO("atendido"),
    PENDENTE("pendente"),
    CANCELADO("cancelado");

    private String descricao;

    Tipo(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }

}
