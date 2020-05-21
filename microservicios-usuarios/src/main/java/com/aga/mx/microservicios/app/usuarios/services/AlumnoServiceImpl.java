package com.aga.mx.microservicios.app.usuarios.services;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aga.mx.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.aga.mx.microservicios.commons.alumnos.models.entity.Alumno;
import com.aga.mx.microservicios.commons.services.CommonServiceImpl;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{

	@Override
	@Transactional(readOnly=true)
	public List<Alumno> findByNombreorApellido(String term) {		
		return repository.findByNombreorApellido(term) ;
	}

	
}
