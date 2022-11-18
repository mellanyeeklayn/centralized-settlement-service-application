package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.NotaFiscal;

@SpringBootTest
public class NotaFiscalTest {

	@Test
	void contextLoads() {
		NotaFiscal notaFiscal = new NotaFiscal();
		notaFiscal.setIdentdEmissor("99999999");
		notaFiscal.setIdentdDestinatario("12345678");
		notaFiscal.setNumSeq("1");
		notaFiscal.setIndrCont("N");
		notaFiscal.setDomSist("SPB01");
		notaFiscal.setNUOp("12345678912345678912345");
	}
}
