package com.covalense.lms.repository;

import org.springframework.data.repository.CrudRepository;

import com.covalense.lms.dto.UserBean;
public interface LibraryRepository extends  CrudRepository<UserBean, Integer>{

}
