package org.hzero.todo.infra.repository.impl;

import org.springframework.stereotype.Component;
import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.hzero.todo.domain.entity.User;
import org.hzero.todo.domain.repository.UserRepository;
/**
 * <p>
 *  用户资源库实现
 * </p>
 * 
 * @author Timi 2021/08/13 16:14
 */
@Component
public class UserRepositoryImpl extends BaseRepositoryImpl<User> implements UserRepository {
}