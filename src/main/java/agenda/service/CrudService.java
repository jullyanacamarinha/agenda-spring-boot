package agenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class CrudService <T>{

	@Autowired
	CrudRepository<T, Long> repository;

	public T save(T objeto) {
		return repository.save(objeto);
	}

	public List<T> findAll() {
		return (List<T>) repository.findAll();
	}

	public T findByID(Long id) {
		return (T) repository.findOne(id);
	}

	public void delete(T objeto) {
		repository.delete(objeto);
	}

}
