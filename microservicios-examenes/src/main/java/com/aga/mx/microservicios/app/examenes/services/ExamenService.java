package com.aga.mx.microservicios.app.examenes.services;

import java.util.List;

import com.aga.mx.microservicios.commons.examenes.models.entity.Asignatura;
import com.aga.mx.microservicios.commons.examenes.models.entity.Examen;
import com.aga.mx.microservicios.commons.services.CommonService;

public interface ExamenService extends CommonService<Examen> {
	public List<Examen> findByNombre(String term);
	public Iterable<Asignatura> findAllAsignaturas();
}
