package com.lian.programanalysis.controller;


import com.lian.programanalysis.model.DotNode;
import com.lian.programanalysis.model.GoConnectLine;
import com.lian.programanalysis.model.GoNode;
import com.lian.programanalysis.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dotnode")
public class NodeController {
    @Autowired
    NodeService nodeService;
    @GetMapping("getdotnodes")
    public List<DotNode> GetDotNode()
    {

        List<DotNode> result= nodeService.getDotNode();

        return result;
    }
    @GetMapping("getgonodes")
    public List<GoNode> GetGoNode()
    {

        List<GoNode> result= nodeService.getGoNode();

        return result;
    }
    @GetMapping("getgoconnectline")
    public List<GoConnectLine> GetGoConnectLine()
    {

        List<GoConnectLine> result= nodeService.getGoConnectLine();

        return result;
    }




}
