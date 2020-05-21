package com.aga.mx.microservicios.app.respuestas.services;

import com.aga.mx.microservicios.app.respuestas.models.entity.Respuesta;

public interface RespuestaService {
	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas);
}
