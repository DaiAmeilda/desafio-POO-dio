package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Set;

@lombok.Getter
@lombok.Setter
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

  
}
