package com.telecom.applidistrib2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class AppliDistrib2ApplicationTests {

	@Autowired
	private RepositoryEquipe equipeRepository;
	private String label;
	private MyService service;

	@Test
	void contextLoads() {
	}

	@Test
	void testEntity(){
		Equipe e = new Equipe();
		e.setLabel("equipe 1");
		Assert.isTrue("equipe 1".equals(e.toString()), "OK");
	}

	@Test
	void testCreateEquipe(){
		Equipe e = new Equipe();
		e.setLabel("equipe 1");
		equipeRepository.save(e);
		Assert.isTrue(equipeRepository.findAll().size() == 1, "OK");
	}

}
