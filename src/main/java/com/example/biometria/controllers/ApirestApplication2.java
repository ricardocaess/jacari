package com.example.biometria.controllers;

import java.io.IOException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
@RequestMapping("/enviar")
public class ApirestApplication2 {

	static Logger logger = LoggerFactory.getLogger(ApirestApplication2.class);

	@ApiOperation(value = "Confirmar Afiliacion")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "Afiliación realizada exitosamente"), @ApiResponse(code = 401, message = "Session inválida,no autorizado")})
    @PostMapping(path = "/pruebaVida")
	public ResponseEntity<Object> enviarTrama(@RequestBody Request request, @RequestHeader HttpHeaders headers) {

		String tramaRpta = null;
		//HttpHeaders headers = new HttpHeaders();
		
		//invoca al constructor 
		Object response = new Response();
		//EnviarTramaIso enviartramaiso = new EnviarTramaIso();
		
		response = invokarURI(request, "https://api-smartface.sort.uy/dev3/services/evaluatePassiveLivenessToken" ,headers);
		
		//tramaRpta = enviartramaiso.Enviar(request.getMessageent().toString());
		//response.setMessagesal(tramaRpta);
		
		//return tramaRpta;
		return ResponseEntity.ok().body(response);

	}
	
	
	
	

	private Object invokarURI(Object createRequestJson, String uri,  HttpHeaders headers) {
        Object response;
        HttpEntity<Object> request = null;
       // HttpHeaders headers = new HttpHeaders();
       // headers.set("Content-Type", "application/json");
       // headers.set("Authorization", "Basic " + userDataUtil.getBasicAuth().trim());
        //try {
            request = new HttpEntity<Object>(createRequestJson, headers);
        //} catch (IOException e) {
            //log.error(e.getMessage(), e);
       // }
        response = new RestTemplate().postForObject(uri, request, Object.class);
        return response;
    }


}
