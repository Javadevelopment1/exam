package com.exam.serviceimpl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.entity.FillQuestion;
import com.exam.mapper.FillQuestionMapper;
import com.exam.service.FillQuestionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FillQuestionServiceImpl implements FillQuestionService {

    @Autowired
    private FillQuestionMapper fillQuestionMapper;

    @Override
    public List<FillQuestion> findByIdAndType(Integer paperId) {
        return null;
    }

    @Override
    public IPage<FillQuestion> findAll(Page<FillQuestion> page) {
        return null;
    }

    @Override
    public FillQuestion findOnlyQuestionId() {
        return null;
    }

    @Override
    public int add(FillQuestion fillQuestion) {
        return 0;
    }

    @Override
    public List<Integer> findBySubject(String subject, Integer pageNo) {
        return null;
    }
}
