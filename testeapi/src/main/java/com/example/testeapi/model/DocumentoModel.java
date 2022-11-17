package com.example.testeapi.model;


import javax.persistence.*;

@Entity(name = "documento")
public class DocumentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codigo;

    @Column( length = 20)
    public String CodMsg;

    @Column( length = 20)
    public String NumCtrlSLC;

    @Column( length = 20)
    public String IdentdEmissor;

    @Column( length = 20)
    public String ISPBIF;

    @Column( length = 20)
    public String TpInf;

    @Column( length = 20)
    public String DtLiquid;

    @Column( length = 20)
    public String NumSeqCicloLiquid;

}
