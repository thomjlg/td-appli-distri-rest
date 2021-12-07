package com.telecom.applidistrib2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEquipe extends JpaRepository<Equipe, Long> {

}

