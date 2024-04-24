package com.boot.migration;

import com.boot.questionpro.entity.Question;
import com.boot.questionpro.repo.QuestionRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class Migration implements ApplicationRunner {

    private final QuestionRepo questionRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("test");
        // get userinterlinks
        // create panel_member, cx_transaction, responset_set, custom fields
        //


        List<Question> questionList = questionRepo.findAll();
        for (Question question : questionList) {
            System.out.println(question);
        }
    }


}
