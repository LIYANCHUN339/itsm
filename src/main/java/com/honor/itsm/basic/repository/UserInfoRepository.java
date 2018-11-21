package com.honor.itsm.basic.repository;

import com.honor.itsm.basic.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    public List<UserInfo> findUserInfoByUserId(String userid);
}