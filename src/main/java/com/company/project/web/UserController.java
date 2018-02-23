package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2018/02/08.
 */
@RestController
@RequestMapping("/user")

public class UserController {
    @Resource
    private UserService userService;

    /**
     * @param user
     * @return
     */
    @PostMapping("")
    public Result add(User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult(user.getId());
    }

    /**
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    public Result update(User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result detail(@PathVariable("id") Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    /**
     * @param page
     * @param size
     * @return
     */
    @GetMapping("")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
