package com.exam.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.entity.MultiQuestion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MultiQuestionMapper {
    @Select("select * from multi_question where questionId in (select questionId from paper_manage where questionType=1 and paperId=#{paperId} )")
    List<MultiQuestion> findByIdAndType(Integer paperId);

    @Select("select * from multi_question")
    IPage<MultiQuestion> findAll(Page page);

    @Select("select questionId from multi_question order by questionId desc limit 1")
    MultiQuestion findOnLdQuestion();

    @Options(useGeneratedKeys = true, keyProperty = "questionId")
    @Insert("insert into multi_question(subject,question,answerA,answerB,answerC,answerD,rightAnswer,analysis,section,level) " +
            "values(#{subject},#{question},#{answerA},#{answerB},#{answerC},#{answerD},#{rightAnswer},#{analysis},#{section},#{level})")
    int add(MultiQuestion multiQuestion);

    @Select("select questionId from multi_question where subject = #{subject} order by rand() desc limit #{pageNo}")
    List<Integer> findBySubject(String subject, Integer pageNo);
}
