package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.view.ManipuladorArquivo;
import com.example.demo.view.ParserJSON;
import java.io.IOException;
import org.json.*;

@SpringBootApplication
public class SpringbootApiApplication {

	public static void main(String[] args) throws JSONException, IOException {

		String path = "C:\\Users\\lsv\\Documents\\GitHub\\teste\\SLC0001-modelo.xml";
		String stringXml = ManipuladorArquivo.leitor(path);
		ParserJSON parser = new ParserJSON();
		String json = parser.ProdutoToJson(stringXml);
		System.out.println(json);
		SpringApplication.run(SpringbootApiApplication.class, args);
	}

}
