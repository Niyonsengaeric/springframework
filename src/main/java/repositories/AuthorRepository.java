package repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
