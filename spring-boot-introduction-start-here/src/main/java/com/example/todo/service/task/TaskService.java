package com.example.todo.service.task;

import com.example.todo.controller.task.TaskDTO;

import java.util.List;

public class TaskService {
    public List<TaskDTO> find(){
        var task1 = new TaskDTO(1L,  "Spring勉強", "TODOアプリケーションの作成", "TODO");

        var task2 = new TaskDTO(2L,  "Springセキュリティーの勉強", "ログイン機能の実装", "TODO");

        return List.of(task1, task2);

    }
}
