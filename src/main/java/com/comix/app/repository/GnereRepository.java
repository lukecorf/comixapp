package com.comix.app.repository;

import com.comix.app.domain.EGnere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface GnereRepository extends JpaRepository<EGnere, Long>, JpaSpecificationExecutor<EGnere> {
}
