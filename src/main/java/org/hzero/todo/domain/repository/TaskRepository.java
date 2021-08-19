package org.hzero.todo.domain.repository;
import java.util.List;
import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.mybatis.base.BaseRepository;
import org.hzero.todo.domain.entity.Task;
/**
 * <p>
 * 任务资源库
 * </p>
 * 
 * @author Timi 2021/08/13 15:52
 */
public interface TaskRepository extends BaseRepository<Task> {
    /**
     * 分页查询任务
     *
     * @param task Task
     * @param pageRequest 分页参数
     * @return Page<Task>
     */
    Page<Task> pageTask(Task task, PageRequest pageRequest);
    /**
     * 根据员工ID查询任务
     *
     * @param employeeId 员工ID
     * @return List<Task>
     */
    List<Task> selectByEmployeeId(Long employeeId);
    /**
     * 根据任务编号查询任务详细(包含员工姓名)
     *
     * @param taskNumber 任务编号
     * @return Task
     */
    Task selectDetailByTaskNumber(String taskNumber);
}