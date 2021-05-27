package com.sagem.requivalence.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sagem.requivalence.entites.Users;
import com.sagem.requivalence.repositories.Repositoriesuser;

@Service
public class Serviceuser {
	
	@Autowired
	Repositoriesuser usr ;

	public <S extends Users> S save(S entity) {
		return usr.save(entity);
	}

	public <S extends Users> Optional<S> findOne(Example<S> example) {
		return usr.findOne(example);
	}

	public Page<Users> findAll(Pageable pageable) {
		return usr.findAll(pageable);
	}

	public List<Users> findAll() {
		return usr.findAll();
	}

	public List<Users> findAll(Sort sort) {
		return usr.findAll(sort);
	}

	public List<Users> findAllById(Iterable<Long> ids) {
		return usr.findAllById(ids);
	}

	public <S extends Users> List<S> saveAll(Iterable<S> entities) {
		return usr.saveAll(entities);
	}

	public Optional<Users> findById(Long id) {
		return usr.findById(id);
	}

	public void flush() {
		usr.flush();
	}

	public <S extends Users> S saveAndFlush(S entity) {
		return usr.saveAndFlush(entity);
	}

	public boolean existsById(Long id) {
		return usr.existsById(id);
	}

	public void deleteInBatch(Iterable<Users> entities) {
		usr.deleteInBatch(entities);
	}

	public <S extends Users> Page<S> findAll(Example<S> example, Pageable pageable) {
		return usr.findAll(example, pageable);
	}

	public void deleteAllInBatch() {
		usr.deleteAllInBatch();
	}

	public Users getOne(Long id) {
		return usr.getOne(id);
	}

	public <S extends Users> long count(Example<S> example) {
		return usr.count(example);
	}

	public <S extends Users> boolean exists(Example<S> example) {
		return usr.exists(example);
	}

	public <S extends Users> List<S> findAll(Example<S> example) {
		return usr.findAll(example);
	}

	public long count() {
		return usr.count();
	}

	public void deleteById(Long id) {
		usr.deleteById(id);
	}

	public <S extends Users> List<S> findAll(Example<S> example, Sort sort) {
		return usr.findAll(example, sort);
	}

	public void delete(Users entity) {
		usr.delete(entity);
	}

	public void deleteAll(Iterable<? extends Users> entities) {
		usr.deleteAll(entities);
	}

	public void deleteAll() {
		usr.deleteAll();
	}
	

}
