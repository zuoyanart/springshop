package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Node;
import com.company.project.service.NodeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

/**
* Created by CodeGenerator on 2018/02/09.
*/
@RestController
@RequestMapping("/node")
@Validated
public class NodeController {
    @Resource
    private NodeService nodeService;

    @PostMapping
    public Result add(@RequestBody Node node) {
        nodeService.save(node);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        nodeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Node node) {
        nodeService.update(node);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Node node = nodeService.findById(id);
        return ResultGenerator.genSuccessResult(node);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Node> list = nodeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PutMapping("/ishide")
    public Result changeHide(@Min(value=5, message="id必须大于5") @RequestParam(defaultValue = "0") Integer id, @RequestParam(defaultValue = "0") Integer ishide) {
        try {
            nodeService.changeHide(id, ishide);
            return ResultGenerator.genSuccessResult();
        } catch (Exception e) {
            return ResultGenerator.genFailResult(e.getMessage());
        }
    }


}
