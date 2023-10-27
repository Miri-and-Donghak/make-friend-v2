package com.miri_and_donghak.makefriend.domain.service;

import com.miri_and_donghak.makefriend.domain.entity.Charcter;
import com.miri_and_donghak.makefriend.domain.entity.dto.SaveCharcterRequest;
import com.miri_and_donghak.makefriend.domain.repository.CharcterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharcterService {
    private final CharcterRepository repository;

    public void createCharcter(SaveCharcterRequest request){
        Charcter ct = new Charcter();
        ct.setAccessories(request.getAccessories());
        ct.setName(request.getName());
        ct.setDescription(request.getDescription());

        repository.save(ct);
    }
}
