package com.id.cap.skillgrid.controller;

import com.id.cap.skillgrid.dto.Answer;
import com.id.cap.skillgrid.dto.Domain;
import com.id.cap.skillgrid.dto.Skill;
import com.id.cap.skillgrid.repository.AnswerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("save")
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SaveController {;
    @Autowired
    private AnswerRepository answerRepository;
    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody List<Domain> domainList){
        for(Domain dom : domainList){
            for(Skill sk: dom.getSkills()){
                if (sk.getGrade()>0){
                    answerRepository.save(new Answer(dom.getMatricule(),dom.getDomain(),sk.getText(),sk.getGrade(),sk.getSuggested()));
                }
            }
        }

    }
    @RequestMapping(method = RequestMethod.GET)
    public void GET(){
        System.out.println("le domain");
    }
}
