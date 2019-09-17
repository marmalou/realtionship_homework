package com.codeclan.relationship.relationships_homework.repositories;

import com.codeclan.relationship.relationships_homework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<File, Long> {
}
