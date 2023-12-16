package com.comix.app.repository;

import com.comix.app.domain.EWriter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WriterRepository extends JpaRepository<EWriter,Long>, JpaSpecificationExecutor<EWriter> {
}
