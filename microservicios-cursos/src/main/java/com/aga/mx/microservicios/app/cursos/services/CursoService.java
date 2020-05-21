package com.aga.mx.microservicios.app.cursos.services;

import com.aga.mx.microservicios.app.cursos.models.entity.Curso;
import com.aga.mx.microservicios.commons.services.CommonService;

public interface CursoService extends CommonService<Curso> {

	public Curso findCursoByAlumnoId(Long id);

}
