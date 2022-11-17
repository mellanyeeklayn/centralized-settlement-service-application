package com.example.testeapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "usuario")
public class UsuarioModel {

    @Id
    public Integer codigo;

    @Column ( length = 3)
    public String CodProdt;

    @Column ( length = 20)
    public String Grupo_IdentdLinhaBilat;

    @Column ( length = 2)
    public String Grupo_TpDeb_Cred;

    @Column ( length = 20)
    public String Grupo_ISPBIFCredtd;

    @Column ( length = 20)
    public String Grupo_ISPBIFDebtd;

    @Column ( length = 20)
    public String Grupo_VlrLanc;

    @Column ( length = 20)
    public String Grupo_CNPJNLiqdantDebtd;

    @Column ( length = 20)
    public String Grupo_NomCliDebtd;

    @Column ( length = 20)
    public String Grupo_CNPJNLiqdantCredtd;

    @Column ( length = 20)
    public String Grupo_NomCliCredtd;

    @Column ( length = 20)
    public String Grupo_TpTranscSLC;


}
