package agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import agenda.model.Evento;
import agenda.repository.EventoRepository;

@Service
public class EventoService extends CrudService<Evento> {

	@Autowired
	private EventoRepository eventoRepository;
	
	public void remover(Long id) {
		eventoRepository.removerEvento(id);
	}
	
	public Evento alterar(Long id, Evento evento){
		Evento eventoTemp = eventoRepository.findOne(id);
		if(eventoTemp != null){
			evento.setId(id);
			return eventoRepository.save(evento);
		}
		else{
			return null;
		}
	}
}
