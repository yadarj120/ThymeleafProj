package com.blueyonder.thymeleafproj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blueyonder.thymeleafproj.model.Tutorial;
import com.blueyonder.thymeleafproj.repository.TutRepo;
import java.util.List;

@Service
public class TutorialService {

    @Autowired
    private TutRepo tutRepo;

    public List<Tutorial> getAllTutorials() {
        return tutRepo.findAll();
    }
}
