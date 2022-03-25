package tn.esprit.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entity.Voyage;

public interface Voyagerepo extends CrudRepository<Voyage, Long> {

	@Query(value=" SELECT v from Voyage v "
			+ "where distnation= :distnation and IdVoyage != :id "
			+ "and (((DATEDIFF(date,(SELECT date as d from Voyage where IdVoyage=:id))>0) and "
			+ "(DATEDIFF(adddate((SELECT date from Voyage where IdVoyage=:id),(SELECT duree from Voyage where IdVoyage=:id)),date)>0))"
			+ "or"
			+ "((DATEDIFF(date,(SELECT date as d from Voyage where IdVoyage=:id))<0) and "
			+ "(DATEDIFF(adddate(date,duree),(SELECT date from Voyage where IdVoyage=:id))>0)))")

	public List<Voyage> findbydistnation (
			@Param("distnation") String distnation,
			@Param("id") Long id);


}
