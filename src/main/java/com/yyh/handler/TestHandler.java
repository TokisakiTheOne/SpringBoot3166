package com.yyh.handler;

import com.yyh.dao.DeptDao;
import com.yyh.po.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-01-01-14:42
 */
@Controller
public class TestHandler {

    @Autowired
    private DeptDao dd;

    @RequestMapping("/")
    public String test(Model model) {
        model.addAttribute("list",dd.selectAll());
        return "index";
    }

}
