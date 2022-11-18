package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(length = 3)
    public String CodProdt;

    @Column (length = 20)
    public String IdentdLinhaBilat;

    @Column (length = 2)
    public String TpDeb_Cred;

    @Column (length = 10)
    public String ISPBIFCredtd;

    @Column (length = 10)
    public String ISPBIFDebtd;

    @Column (length = 10)
    public String VlrLanc;

    @Column (length = 16)
    public String CNPJNLiqdantDebtd;

    @Column (length = 3)
    public String NomCliDebtd;

    @Column (length = 20)
    public String CNPJNLiqdantCredtd;

    @Column (length = 20)
    public String NomCliCredtd;

    @Column (length = 20)
    public String TpTranscSLC;

}
