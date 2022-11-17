package com.example.testeapi.model;

import javax.persistence.*;


@Entity(name = "usuario")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codigo;

    @Column( length = 3)
    public String CodProdt;

    @Column ( length = 20)
    public String IdentdLinhaBilat;

    @Column ( length = 2)
    public String TpDeb_Cred;

    @Column ( length = 10)
    public String ISPBIFCredtd;

    @Column ( length = 10)
    public String ISPBIFDebtd;

    @Column ( length = 10)
    public String VlrLanc;

    @Column ( length = 16)
    public String CNPJNLiqdantDebtd;

    @Column ( length = 3)
    public String NomCliDebtd;

    @Column ( length = 20)
    public String CNPJNLiqdantCredtd;

    @Column ( length = 20)
    public String NomCliCredtd;

    @Column ( length = 20)
    public String TpTranscSLC;

}
