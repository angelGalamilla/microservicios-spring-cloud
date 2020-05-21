package com.aga.mx.microservicios.app.examenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aga.mx.microservicios.app.examenes.models.repository.AsignaturaRepository;
import com.aga.mx.microservicios.app.examenes.models.repository.ExamenRepository;
import com.aga.mx.microservicios.commons.examenes.models.entity.Asignatura;
import com.aga.mx.microservicios.commons.examenes.models.entity.Examen;
import com.aga.mx.microservicios.commons.services.CommonServiceImpl;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements ExamenService{

	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Examen> findByNombre(String term) {
		return repository.findByNombre(term);
	}

	@Override
	public Iterable<Asignatura> findAllAsignaturas() {
		return asignaturaRepository.findAll();
	}

}
