package com.sp.contorller;

import com.sp.service.SampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class SampleController {


    private final SampleService sampleService;

    @Autowired
    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }


    @RequestMapping(value = "/")
    public ModelAndView home() {
        log.info("zzzzzzzzzz");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sample/sample");
        modelAndView.addObject("resultList",sampleService.getUserList());


        return modelAndView;
    }

}
