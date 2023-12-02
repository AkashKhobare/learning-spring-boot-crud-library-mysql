package com.learn.spring.boot.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.spring.boot.library.model.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {

	List<Library> findByUserId(Long userId);

}
