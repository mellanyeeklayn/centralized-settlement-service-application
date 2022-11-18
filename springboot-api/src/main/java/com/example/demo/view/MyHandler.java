package com.example.demo.view;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
// import java.util.HashMap;

public class MyHandler extends DefaultHandler {
    private final StringBuffer estruturaLida = new StringBuffer(200);
    private final StringBuffer valorAtual = new StringBuffer(100);
    private final StringBuffer valorTotal = new StringBuffer(10000);
    // private HashMap<String, Object> myMap = new HashMap<>();

    public void startDocument() {
        System.out.print("Iniciando leitura XML ...");
    }

    public void endDocument() {
        System.out.print("\n Finalizando leitura XML...");
    }

    public void startElement(
            String uri,
            String localName,
            String tag,
            Attributes atributos)  {

        estruturaLida.append("/").append(tag);

//        System.out.print(
//                "\n<"
//                        + estruturaLida.substring(1)
//                        + (atributos.getLength() != 0 ? " +ATRIBUTOS" : "")
//                        + ">");

        valorAtual.delete(0, valorAtual.length());
        valorTotal.append("\n<").append(estruturaLida.substring(1)).append(atributos.getLength() != 0 ? " +ATRIBUTOS" : "").append(">");
    }

    public void endElement(String uri, String localName, String tag)   {

        //System.out.print(valorAtual.toString().trim());
        valorTotal.append(valorAtual.toString().trim());
        valorAtual.delete(0, valorAtual.length());

        estruturaLida.delete(
                estruturaLida.length() - tag.length() - 1,
                estruturaLida.length());

    }

    public void characters(char[] ch, int start, int length) {

        valorAtual.append(ch, start, length);

    }

    public StringBuffer getValorTotal(){
        return valorTotal;
    }

}

