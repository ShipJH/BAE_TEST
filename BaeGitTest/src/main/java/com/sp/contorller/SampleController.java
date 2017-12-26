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

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sample/sample");
        modelAndView.addObject("resultList",sampleService.getUserList());


        return modelAndView;
    }
    
    //�뀒�뒪�듃 �솕硫�1 遺��듃�뒪�듃�옪�쟻�슜
    @RequestMapping("main")
   public ModelAndView mainpage() {
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("sample/test");
       
       return modelAndView;
   }
  //�뀒�뒪�듃 �솕硫�2 遺��듃�뒪�듃�옪�쟻�슜
    @RequestMapping("main2")
   public ModelAndView mainpage2() {
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("sample/test2");
       
       return modelAndView;
   }
    
  //다음주소 API 테스트
    @RequestMapping("/daumApi")
    public ModelAndView join() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("skTest/daumApi");
        
        return modelAndView;
    }
    
    //QRcode 테스트
    @RequestMapping("/qrCode")
    public ModelAndView qrCode() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("skTest/qrCode");
        
        return modelAndView;
    }
    
    //QRcode google API테스트
    @RequestMapping("/qrCode2")
    public ModelAndView qrCode2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("skTest/qrCode2");
        
        return modelAndView;
    }
    
}
