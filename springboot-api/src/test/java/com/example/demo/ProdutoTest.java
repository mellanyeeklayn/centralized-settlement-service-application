package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Produto;

@SpringBootTest
public class ProdutoTest {

	@Test
	void contextLoads() {
		Produto produto = new Produto();
		produto.setCodProdt("MCC");
		produto.setIdentdLinhaBilat("12345678MCC1633000");
		produto.setTpDeb_Cred("C");
		produto.setISPBIFCredtd("99999999");
		produto.setISPBIFDebtd("99999999");
		produto.setVlrLanc("5462.12");
		produto.setCNPJNLiqdantDebtd("93052785000127");
		produto.setNomCliDebtd("TRIANGULOBOB");
		produto.setCNPJNLiqdantCredtd("07284171000139");
		produto.setNomCliCredtd("BANCO");
		produto.setTpTranscSLC("02");
	}
}
