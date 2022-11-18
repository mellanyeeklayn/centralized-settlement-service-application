package com.example.demo.view;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class ParserJSON {
    public String NotaFiscalToJson(String xml) throws JSONException {
        JSONObject paisesJson = XML.toJSONObject(xml);
		JSONObject json = (JSONObject) paisesJson.get("DOC");
        JSONObject json2 = (JSONObject) json.get("BCMSG");
        return json2.toString();
    }

    public String DocumentoToJson(String xml) throws JSONException {
        JSONObject paisesJson = XML.toJSONObject(xml);
        JSONObject json = (JSONObject) paisesJson.get("DOC");
        JSONObject json2 = (JSONObject) json.get("SISMSG");
        JSONObject json3 = (JSONObject) json2.get("SLC0001");
        return json3.toString();
    }

    public String ProdutoToJson(String xml) throws JSONException {
        JSONObject paisesJson = XML.toJSONObject(xml);
        JSONObject json = (JSONObject) paisesJson.get("DOC");
        JSONObject json2 = (JSONObject) json.get("SISMSG");
        JSONObject json3 = (JSONObject) json2.get("SLC0001");
        JSONObject json4 = (JSONObject) json3.get("Grupo_SLC0001_Liquid");
        return json4.toString();
    }
}