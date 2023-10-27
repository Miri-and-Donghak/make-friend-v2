package com.miri_and_donghak.makefriend.domain.service;

import com.miri_and_donghak.makefriend.domain.entity.Charcter;
import com.miri_and_donghak.makefriend.domain.entity.dto.SaveCharcterRequest;
import com.miri_and_donghak.makefriend.domain.repository.CharcterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class CharcterService {
    private final CharcterRepository repository;

    public CharcterService(CharcterRepository repository){
        this.repository = repository;
    }

    public void createCharcter(SaveCharcterRequest request){
        Charcter ct = new Charcter();
        ct.setAccessories(request.getAccessories());
        ct.setHairstyle(request.getHairstyle());
        ct.setName(request.getName());
        ct.setDescription(request.getDescription());

        repository.save(ct);
    }
}
