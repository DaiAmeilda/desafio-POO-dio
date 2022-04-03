package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Set;

@lombok.Getter
@lombok.Setter
public class Desafio extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Desafio() {
    }

    
    @Override
    public String toString() {
        return "Desafio{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
