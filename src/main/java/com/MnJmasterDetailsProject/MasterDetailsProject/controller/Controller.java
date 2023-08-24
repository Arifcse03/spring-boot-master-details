package com.MnJmasterDetailsProject.MasterDetailsProject.controller;

import com.MnJmasterDetailsProject.MasterDetailsProject.model.ChildTable;
import com.MnJmasterDetailsProject.MasterDetailsProject.model.HeaderTable;
import com.MnJmasterDetailsProject.MasterDetailsProject.repository.ChildRepository;
import com.MnJmasterDetailsProject.MasterDetailsProject.repository.HeadertableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private HeadertableRepository headertableRepository;
    @Autowired
    private ChildRepository childRepository;
    @GetMapping("/hello")
    public String helloWorld() {
        System.out.print("hello -----------------------------------------");

        return "Hello, World!";
    }
    @GetMapping("/getall")
    public String  getAllData (Model model){
        List<HeaderTable> headerTables = headertableRepository.findAll();
        List<ChildTable> childTables = childRepository.findAll();
        for (ChildTable table : childTables) {
            System.out.println(table); // Assuming HeaderTable has a meaningful toString() method
        }
        model.addAttribute("headerTables", headerTables);
        model.addAttribute("childTables", childTables);
        return "data";
    }
}
