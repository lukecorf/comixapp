package com.comix.app.repository;

import com.comix.app.domain.EUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<EUser,Long>, JpaSpecificationExecutor<EUser> {
}
