package com.example.todo.service.task;

import java.util.List;

public class TaskService {
    public List<TaskEntity> find(){
        var task1 = new TaskEntity(1L,  "Spring勉強", "TODOアプリケーションの作成",TaskStatus.TODO);

        var task2 = new TaskEntity(2L,  "Springセキュリティーの勉強", "ログイン機能の実装", TaskStatus.DOING);

        return List.of(task1, task2);

    }
}
