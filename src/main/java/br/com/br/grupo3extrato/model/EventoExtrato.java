package br.com.br.grupo3extrato.model;

import br.com.br.grupo3extrato.enumerador.EnumOperacao;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class EventoExtrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private EnumOperacao operacao;
    @NotNull
    @Positive
    private BigDecimal valor;
    @NotNull
    private LocalDate dataOperacao;
    @NotNull
    private Long clienteId;
    @NotBlank
    private String contaParticipante;

    @Override
    public String toString() {
        return "EventoExtrato{" +
                "id=" + id +
                ", operacao=" + operacao +
                ", valor=" + valor +
                ", dataOperacao=" + dataOperacao +
                ", clienteId=" + clienteId +
                ", contaParticipante='" + contaParticipante + '\'' +
                '}';
    }
}

