package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Documento;

@SpringBootTest
public class DocumentoTest {
	
	@Test
	void contextLoads() {
		Documento documento = new Documento();
		documento.setCodMsg("SLC0001");
		documento.setNumCtrlSLC("12345678912345678912");
		documento.setISPBIF("12345678");
		documento.setDtLiquid("2022-01-01");
		documento.setNumSeqCicloLiquid("1");
		documento.setDtHrSLC("2022-01-01T08:40:21");
		documento.setDtMovto("2022-01-01");
	}
}
