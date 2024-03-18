package com.oracle.fcr.ngi.renameIt.repository;


import com.oracle.fcr.ngi.renameIt.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, String> {

}
