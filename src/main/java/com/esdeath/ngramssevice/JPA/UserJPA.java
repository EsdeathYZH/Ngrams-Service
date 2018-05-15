package com.esdeath.ngramssevice.JPA;


import com.esdeath.ngramssevice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJPA extends JpaRepository<UserEntity,Long>
{
    //使用SpringDataJPA方法定义查询
    public UserEntity findByUsername(String username);
}
