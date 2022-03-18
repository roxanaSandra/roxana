package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpresa;

    @Column(name = "razon_social", nullable = false, length = 150)
    private String razonSocial;

    @Column(name = "nombre_comercial", nullable = false, length = 100)
    private String nombreComercial;

    @Column(name = "numero_ruc", nullable = false, length = 11, unique = true)
    private String numeroRuc;

    @Column(name = "actividad", nullable = false, length = 300)
    private String actividad;

    @Column(name = "zonificacion", nullable = true, length = 100)
    private String zonificacion;

    @Column(name = "id_representante", nullable = false, length = 15)
    private Long id_representante;

    @Column(name = "id_giro_negocio", nullable = false, length = 11)
    private GiroNegocio giroNegocio;

}
