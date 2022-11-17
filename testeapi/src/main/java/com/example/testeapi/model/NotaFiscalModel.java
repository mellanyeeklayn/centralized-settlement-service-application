package com.example.testeapi.model;


import javax.persistence.*;

@Entity(name = "usuario")
public class NotaFiscalModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codigo;

    @Column( length = 20)
    public String IdentdEmissor;

    @Column( length = 20)
    public String IdentdDestinatario;

    @Column( length = 20)
    public String NumSeq;

    @Column( length = 20)
    public String IndrCont;

    @Column( length = 20)
    public String DomSist;

    @Column( length = 20)
    public String NUOp;



}
