package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class NotaFiscal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(length = 20)
    public String IdentdEmissor;

    @Column(length = 20)
    public String IdentdDestinatario;

    @Column(length = 20)
    public String NumSeq;

    @Column(length = 20)
    public String IndrCont;

    @Column(length = 20)
    public String DomSist;

    @Column(length = 20)
    public String NUOp;

}


