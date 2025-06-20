package com.olflores.learning.photozclone.repository;

import com.olflores.learning.photozclone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {

}