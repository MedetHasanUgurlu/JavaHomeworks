package com.medet.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medet.hmrs.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
