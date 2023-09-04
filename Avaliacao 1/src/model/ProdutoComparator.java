package model;

public class ProdutoComparator implements java.util.Comparator<Aluno>{
    @Override
    public int compare(Aluno a, Aluno b) {
        return a.getId() - b.getId();
    }
}
