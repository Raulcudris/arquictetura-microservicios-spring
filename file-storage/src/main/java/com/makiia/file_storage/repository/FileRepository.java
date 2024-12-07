package com.makiia.file_storage.repository;

import com.makiia.file_storage.model.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, String> {
}
