package com.hx.dao.dal;

import com.hx.dao.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description：
 *
 * @author: liu.hx
 * @date: 2019-09-11  10:26
 */
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {
}
