package model;

import java.sql.Time;
import java.util.Date;

public class Locacao {
    private Date dataLocacao;
    private Time horaLocacao;
    private Date dataDevolucao;
    private Time horaDevolucao;
    private int quilometragem;
    private double valorCalcao;
    private double valor_locacao;
    private boolean devolvido;
}
