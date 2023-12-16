package com.comix.app.repository;

import com.comix.app.domain.EPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<EPublisher, Long>, JpaSpecificationExecutor<EPublisher> {
}
