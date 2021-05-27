package com.sagem.requivalence.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sagem.requivalence.entites.Composants;
import com.sagem.requivalence.repositories.RepositoriesComposants;

@Service
public class ServiceComposants {
	@Autowired
	RepositoriesComposants composant;

	public <S extends Composants> S save(S entity) {
		return composant.save(entity);
	}

	public <S extends Composants> Optional<S> findOne(Example<S> example) {
		return composant.findOne(example);
	}

	public Page<Composants> findAll(Pageable pageable) {
		return composant.findAll(pageable);
	}

	public List<Composants> findAll() {
		return composant.findAll();
	}

	public List<Composants> findAll(Sort sort) {
		return composant.findAll(sort);
	}

	public List<Composants> findAllById(Iterable<Long> ids) {
		return composant.findAllById(ids);
	}

	public <S extends Composants> List<S> saveAll(Iterable<S> entities) {
		return composant.saveAll(entities);
	}

	public Optional<Composants> findById(Long id) {
		return composant.findById(id);
	}

	public void flush() {
		composant.flush();
	}

	public <S extends Composants> S saveAndFlush(S entity) {
		return composant.saveAndFlush(entity);
	}

	public boolean existsById(Long id) {
		return composant.existsById(id);
	}

	public void deleteInBatch(Iterable<Composants> entities) {
		composant.deleteInBatch(entities);
	}

	public <S extends Composants> Page<S> findAll(Example<S> example, Pageable pageable) {
		return composant.findAll(example, pageable);
	}

	public void deleteAllInBatch() {
		composant.deleteAllInBatch();
	}

	public Composants getOne(Long id) {
		return composant.getOne(id);
	}

	public <S extends Composants> long count(Example<S> example) {
		return composant.count(example);
	}

	public <S extends Composants> boolean exists(Example<S> example) {
		return composant.exists(example);
	}

	public <S extends Composants> List<S> findAll(Example<S> example) {
		return composant.findAll(example);
	}

	public long count() {
		return composant.count();
	}

	public void deleteById(Long id) {
		composant.deleteById(id);
	}

	public <S extends Composants> List<S> findAll(Example<S> example, Sort sort) {
		return composant.findAll(example, sort);
	}

	public void delete(Composants entity) {
		composant.delete(entity);
	}

	public void deleteAll(Iterable<? extends Composants> entities) {
		composant.deleteAll(entities);
	}

	public void deleteAll() {
		composant.deleteAll();
	}

}
