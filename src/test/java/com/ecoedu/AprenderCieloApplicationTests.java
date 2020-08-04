package com.ecoedu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecoedu.dao.ClasepruebaDao;
import com.ecoedu.dao.PersonaDao;
import com.ecoedu.model.Claseprueba;
import com.ecoedu.model.Persona;
import com.ecoedu.services.ClasepruebaServices;
import com.ecoedu.services.ClasepruebaServicesImpl;

@SpringBootTest
class AprenderCieloApplicationTests {

	@Autowired
	PersonaDao obj; 
	
	@Autowired
	ClasepruebaServices objetito;
	
	@Test
	void contextLoads() {
		for (Persona objPersona : obj.findAll()) {
			System.err.println(objPersona.getNombres());
		}
	}

}
