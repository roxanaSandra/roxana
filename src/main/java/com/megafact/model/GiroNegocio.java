package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "giro_negocio")
public class GiroNegocio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGiroNegocio;

}
