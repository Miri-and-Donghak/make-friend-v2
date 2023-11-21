package com.miri_and_donghak.makefriend.domain.service;

import com.miri_and_donghak.makefriend.domain.entity.Charcter;
import com.miri_and_donghak.makefriend.domain.entity.dto.InitCharcterRequest;
import com.miri_and_donghak.makefriend.domain.repository.CharcterRepository;
import org.springframework.stereotype.Service;

@Service
public class CharcterService {
    private final CharcterRepository repository;

    public CharcterService(CharcterRepository repository) {
        this.repository = repository;
    }

    public void initCharcter(InitCharcterRequest request){
        Charcter ct = new Charcter(request.getName(), request.getAge(), request.isGender(), request.getDescription());

        repository.save(ct);
    }
}
