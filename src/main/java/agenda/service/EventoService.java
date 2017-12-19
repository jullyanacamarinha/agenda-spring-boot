package agenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import agenda.model.Evento;
import agenda.repository.EventoRepository;

@Service
public class EventoService extends CrudService<Evento> {

	@Autowired
	private EventoRepository eventoRepository;


}
