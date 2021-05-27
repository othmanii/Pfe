package com.sagem.requivalence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sagem.requivalence.entites.Composants;

@Repository
public interface RepositoriesComposants extends JpaRepository<Composants , Long> {

}
