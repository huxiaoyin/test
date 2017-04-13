package com.controller;

import com.dao.StudentMapper;
import com.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/13.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/get")
    @ResponseBody
    public String getStu() {
        System.out.print("Test------------------------->Hello");
        return "HELLO,get student";
    }

    @RequestMapping("/insertTest")
    @ResponseBody
    public String insertTest() {
        List<Student> students = new ArrayList<>();

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < 25000; i++) {
                Student s = new Student();
                s.setSname("hxy" + (int) (Math.random() * 9000));
                s.setCid(i % 2 == 0 ? 1 : 2);
                students.add(s);

            }

            studentMapper.insertList(students);
            students.clear();
        }

        return "ok!!!!!!!";
    }

}
