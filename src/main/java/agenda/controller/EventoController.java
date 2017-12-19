package agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import agenda.model.Evento;
import agenda.service.EventoService;

@CrossOrigin(origins = "*")
@RestController
public class EventoController {

	@Autowired
	private EventoService eventoService;

	@GetMapping("/eventos")
	public List<Evento> getEventos() {
		return eventoService.findAll();
	}

	@PostMapping("/eventos")
	public Evento inserirEvento(@RequestBody Evento evento) {
		return eventoService.save(evento);
	}

	@PutMapping("/eventos")
	public Evento alterarEvento(@RequestBody Evento evento) {
		return eventoService.save(evento);
	}

	@DeleteMapping("/eventos")
	public void excluir(@RequestBody Evento evento) {
		eventoService.delete(evento);
	}

}
