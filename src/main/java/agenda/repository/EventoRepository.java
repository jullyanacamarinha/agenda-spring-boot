package agenda.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import agenda.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long> {

	@Transactional
	@Modifying
	@Query("DELETE FROM Evento e WHERE e.id=:id")
	public void removerEvento(@Param("id") Long id);
	
	
}
