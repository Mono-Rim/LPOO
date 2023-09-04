package model;

public class ProdutoComparator implements java.util.Comparator<Produto>{
    @Override
    public int compare(Produto a, Produto b) {
        return a.getId() - b.getId();
    }
}
