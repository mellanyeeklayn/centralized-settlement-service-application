package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(length = 20)
    public String CodMsg;

    @Column(length = 20)
    public String NumCtrlSLC;

    @Column(length = 20)
    public String ISPBIF;

    @Column(length = 20)
    public String TpInf;

    @Column(length = 20)
    public String DtLiquid;

    @Column(length = 20)
    public String NumSeqCicloLiquid;

    @Column(length = 20)
    public String DtHrSLC;

    @Column(length = 20)
    public String DtMovto;

}
