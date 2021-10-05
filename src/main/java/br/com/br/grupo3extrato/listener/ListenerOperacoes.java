package br.com.br.grupo3extrato.listener;


import br.com.br.grupo3extrato.model.EventoExtrato;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerOperacoes {


    @KafkaListener(topics = "operacao")
    public void ouvir (EventoExtrato eventoExtrato){
        System.out.println(eventoExtrato.toString());
    }

}
