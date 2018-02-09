package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Block;
import com.company.project.service.BlockService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/02/09.
*/
@RestController
@RequestMapping("/block")
public class BlockController {
    @Resource
    private BlockService blockService;

    @PostMapping
    public Result add(@RequestBody Block block) {
        blockService.save(block);
        return ResultGenerator.genSuccessResult(block.getId());
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        blockService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Block block) {
        blockService.update(block);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Block block = blockService.findById(id);
        return ResultGenerator.genSuccessResult(block);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Block> list = blockService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
