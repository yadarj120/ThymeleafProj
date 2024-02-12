package com.blueyonder.thymeleafproj.repository;

import com.blueyonder.thymeleafproj.model.Tutorial;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface TutRepo extends JpaRepository<Tutorial, String> {

}
