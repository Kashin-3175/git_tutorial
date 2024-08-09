package com.example.todo.repository.task;

import com.example.todo.service.task.TaskEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface TaskRepository {

    @Select("select id, summary, description, status from tasks;")
    List<TaskEntity> select();

    @Select("select id, summary, description, status from tasks where id = #{taskId}")
    Optional<TaskEntity> selectId(@Param("taskId") long taskId);


    @Insert("""
            INSERT INTO tasks (summary, description, status) 
            VALUES (#{task.summary}, #{task.description}, #{task.status})"""
    )
    void insert(@Param("task") TaskEntity newEntity);
}
