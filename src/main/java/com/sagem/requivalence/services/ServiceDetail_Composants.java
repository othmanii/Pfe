package com.sagem.requivalence.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sagem.requivalence.entites.Detail_Composants;
import com.sagem.requivalence.repositories.RepositoriesDetail_Composants;

@Service
public class ServiceDetail_Composants {
@Autowired
RepositoriesDetail_Composants  detailcomposants;

public <S extends Detail_Composants> S save(S entity) {
	return detailcomposants.save(entity);
}

public <S extends Detail_Composants> Optional<S> findOne(Example<S> example) {
	return detailcomposants.findOne(example);
}

public Page<Detail_Composants> findAll(Pageable pageable) {
	return detailcomposants.findAll(pageable);
}

public List<Detail_Composants> findAll() {
	return detailcomposants.findAll();
}

public List<Detail_Composants> findAll(Sort sort) {
	return detailcomposants.findAll(sort);
}

public List<Detail_Composants> findAllById(Iterable<Long> ids) {
	return detailcomposants.findAllById(ids);
}

public <S extends Detail_Composants> List<S> saveAll(Iterable<S> entities) {
	return detailcomposants.saveAll(entities);
}

public Optional<Detail_Composants> findById(Long id) {
	return detailcomposants.findById(id);
}

public void flush() {
	detailcomposants.flush();
}

public <S extends Detail_Composants> S saveAndFlush(S entity) {
	return detailcomposants.saveAndFlush(entity);
}

public boolean existsById(Long id) {
	return detailcomposants.existsById(id);
}

public void deleteInBatch(Iterable<Detail_Composants> entities) {
	detailcomposants.deleteInBatch(entities);
}

public <S extends Detail_Composants> Page<S> findAll(Example<S> example, Pageable pageable) {
	return detailcomposants.findAll(example, pageable);
}

public void deleteAllInBatch() {
	detailcomposants.deleteAllInBatch();
}

public Detail_Composants getOne(Long id) {
	return detailcomposants.getOne(id);
}

public <S extends Detail_Composants> long count(Example<S> example) {
	return detailcomposants.count(example);
}

public <S extends Detail_Composants> boolean exists(Example<S> example) {
	return detailcomposants.exists(example);
}

public <S extends Detail_Composants> List<S> findAll(Example<S> example) {
	return detailcomposants.findAll(example);
}

public long count() {
	return detailcomposants.count();
}

public void deleteById(Long id) {
	detailcomposants.deleteById(id);
}

public <S extends Detail_Composants> List<S> findAll(Example<S> example, Sort sort) {
	return detailcomposants.findAll(example, sort);
}

public void delete(Detail_Composants entity) {
	detailcomposants.delete(entity);
}

public void deleteAll(Iterable<? extends Detail_Composants> entities) {
	detailcomposants.deleteAll(entities);
}

public void deleteAll() {
	detailcomposants.deleteAll();
}


}
