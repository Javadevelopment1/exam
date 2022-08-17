package com.example.exam.entity;

import lombok.Data;

@Data
public class Message {
    private Integer id;
    private Integer temp_id;//解决id为null所创建的临时id
    private String title;
//    private String content;
//    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8");
//    private Data time;
//    List<Replay> replay;
}
