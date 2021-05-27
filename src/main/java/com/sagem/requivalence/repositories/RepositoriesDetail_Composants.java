package com.sagem.requivalence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sagem.requivalence.entites.Detail_Composants;

@Repository
public interface RepositoriesDetail_Composants extends JpaRepository<Detail_Composants , Long>{

	
}
