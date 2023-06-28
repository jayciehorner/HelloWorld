package com.skillstorm.training.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.models.Film;

@Repository
public interface FilmRepository extends CrudRepository <Film, String>{

	@Query("SELECT f FROM Film f "
			+ " JOIN f.title t "
			+ " JOIN t.description d "
			+ " JOIN d.length l "
			+ " WHERE :description IS NULL OR f.title.description.description = :description AND "
			+ " :length IS NULL OR f.title.description.length.length = :length AND "
			+ " :filmId IS NULL OR f.film.filmId = :film_id")
	Iterable<Film> findBySearchCriteria(@Param("length") String length,
											@Param("description") String description, 
											@Param("film_id") String filmId);
}
