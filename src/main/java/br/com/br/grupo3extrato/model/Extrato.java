package br.com.br.grupo3extrato.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Extrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
