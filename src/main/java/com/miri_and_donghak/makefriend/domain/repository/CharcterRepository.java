package com.miri_and_donghak.makefriend.domain.repository;

import com.miri_and_donghak.makefriend.domain.entity.Charcter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharcterRepository extends JpaRepository<Charcter, Long> {
}
