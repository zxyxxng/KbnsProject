package org.kbns.controller;

import lombok.extern.slf4j.Slf4j;
import org.kbns.domain.HomeVO;
import org.kbns.service.impl.HomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Slf4j
public class HomeController {

    @Autowired
    private HomeServiceImpl homeService;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(Model model) throws Exception {

        List<HomeVO> cardInfo = homeService.getCardInfo();


        model.addAttribute("list", cardInfo);
        System.out.println("cardInfo 값 확인 : " + cardInfo);

        return "index";
    }
}
