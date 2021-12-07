package com.telecom.applidistrib2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class AppliDistrib2Application {

	public static void main(String[] args) {
		SpringApplication.run(AppliDistrib2Application.class, args);
		//copier ces lignes dans le terminal pour créer des joueurs et equipes
		//curl -X POST localhost:8080/joueurs -H 'Content-type:application/json' -d '{"id": "1", "nom": "Julian Alaphilippe"}'
		//curl -X POST localhost:8080/joueurs -H 'Content-type:application/json' -d '{"id": "2", "nom": "Egan Bernal"}'
		//curl -X POST localhost:8080/joueurs -H 'Content-type:application/json' -d '{"id": "3", "nom": "Remco Evenepoel"}'
		//curl -X POST localhost:8080/equipes -H 'Content-type:application/json' -d '{"label": "Deceuninck - Quick Step", "joueurs": [{"id": "1", "nom": "Julian Alaphilippe"}, {"id": "3", "nom": "Remco Evenepoel"}]}'
		//curl -X POST localhost:8080/equipes -H 'Content-type:application/json' -d '{"label": "INEOS", "joueurs": [{"id": "2", "nom": "Egan Bernal"}]}'

	}

}
