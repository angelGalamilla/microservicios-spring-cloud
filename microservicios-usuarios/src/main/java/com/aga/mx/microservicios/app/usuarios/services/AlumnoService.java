package com.aga.mx.microservicios.app.usuarios.services;

import java.util.List;

import com.aga.mx.microservicios.commons.alumnos.models.entity.Alumno;
import com.aga.mx.microservicios.commons.services.CommonService;

public interface AlumnoService extends CommonService<Alumno>{
	public List<Alumno> findByNombreorApellido(String term);
}
