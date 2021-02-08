package com.lian.programanalysis.controller;


import com.lian.programanalysis.model.DotNode;
import com.lian.programanalysis.service.DotNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dotnode")
public class DotNodeController {
    @Autowired
    DotNodeService dotNodeService;
    @GetMapping("getdotnodes")
    public List<DotNode> test()
    {

        List<DotNode> result=dotNodeService.getDotNode();

        return result;
    }

}
