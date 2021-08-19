package org.hzero.todo.infra.mapper;
import java.util.List;
import io.choerodon.mybatis.common.BaseMapper;
import org.hzero.todo.domain.entity.Task;
/**
 * <p>
 *  TaskMapper
 * </p>
 * 
 * @author Timi 2021/08/13 15:48
 */
public interface TaskMapper extends BaseMapper<Task> {
    /**
     * 查询任务
     *
     * @param params 任务查询参数
     * @return Task
     */
    List<Task> selectTask(Task params);
}