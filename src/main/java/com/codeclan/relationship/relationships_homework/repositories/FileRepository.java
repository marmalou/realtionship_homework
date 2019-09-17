package com.codeclan.relationship.relationships_homework.repositories;

import com.codeclan.relationship.relationships_homework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<Folder, Long>{
}
