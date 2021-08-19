package org.hzero.todo.app.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import io.choerodon.core.exception.CommonException;
import org.hzero.todo.app.service.TaskService;
import org.hzero.todo.domain.entity.Task;
import org.hzero.todo.domain.repository.TaskRepository;
/**
 * <p>
 * 任务应用服务实现
 * </p>
 *
 * @author Timi 2021/08/13 15:47
 */
@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Task create(Task task) {
        // 生成任务编号
        task.generateTaskNumber();
        // 插入数据
        taskRepository.insert(task);
        return task;
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Task update(Task task) {
        Task exist = taskRepository.selectByPrimaryKey(task);
        if (exist == null) {
            throw new CommonException("htdo.warn.task.notFound");
        }
        task.setObjectVersionNumber(exist.getObjectVersionNumber());
        // 更新指定字段
        taskRepository.updateOptional(task,
                Task.FIELD_STATE,
                Task.FIELD_TASK_DESCRIPTION
        );
        return task;
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByTaskNumber(String taskNumber) {
        Task task = new Task();
        task.setTaskNumber(taskNumber);
        taskRepository.delete(task);
    }
}