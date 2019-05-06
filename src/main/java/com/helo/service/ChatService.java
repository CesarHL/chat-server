package com.helo.service;

import java.util.List;

import com.helo.model.Mensaje;

public interface ChatService {

	public List<Mensaje> obtenerUltimos10Mensajes();

	public Mensaje guardar(Mensaje mensaje);

}
