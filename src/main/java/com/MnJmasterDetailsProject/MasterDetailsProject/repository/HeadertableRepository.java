package com.MnJmasterDetailsProject.MasterDetailsProject.repository;

import com.MnJmasterDetailsProject.MasterDetailsProject.model.HeaderTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadertableRepository extends JpaRepository<HeaderTable,Long> {

}
