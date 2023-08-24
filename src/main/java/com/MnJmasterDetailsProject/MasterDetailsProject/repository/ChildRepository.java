package com.MnJmasterDetailsProject.MasterDetailsProject.repository;

import com.MnJmasterDetailsProject.MasterDetailsProject.model.ChildTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepository extends JpaRepository<ChildTable, Long> {
}
