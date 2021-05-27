package com.sagem.requivalence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sagem.requivalence.entites.Users;

@Repository
public interface Repositoriesuser extends JpaRepository<Users , Long> {

}
