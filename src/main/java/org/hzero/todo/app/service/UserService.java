package org.hzero.todo.app.service;
import org.hzero.todo.domain.entity.User;
/**
 * <p>
 * 用户应用服务
 * </p>
 *
 * @author Timi 2021/08/13 15:47
 */
public interface UserService {
    /**
     * 创建用户
     *
     * @param user User
     * @return User
     */
    User create(User user);

    /**
     * 删除用户(同时删除任务)
     *
     * @param userId 用户ID
     */
    void delete(Long userId);
}
