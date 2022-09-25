package com.exam.controller;

import com.exam.serviceimpl.JudgeQuestionServiceImpl;
import com.exam.serviceimpl.MessageServiceImpl;
import com.exam.serviceimpl.PaperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaperController {
    @Autowired
    private PaperServiceImpl paperService;

    @Autowired
    private JudgeQuestionServiceImpl judgeQuestionService;

    @Autowired
    private MessageServiceImpl messageService;
}
