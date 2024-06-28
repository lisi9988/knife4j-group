package com.zdw.demo.controller;

import com.zdw.demo.model.dto.UserDto;
import com.zdw.demo.model.dto.UserPageDto;
import com.zdw.demo.model.entity.User;
import com.zdw.demo.toolkit.Result;
import com.zdw.demo.toolkit.ValidaGroup;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户前端控制层
 *
 * @author Tomcat
 */
@RestController
@Tag(name = "用户")
@RequestMapping("user")
public class UserController {

    /**
     * 用户列表
     *
     * @param dto 分页查询信息
     * @return List < User>
     * @author Tomcat
     */
    @Operation(summary = "用户列表")
    @GetMapping("list")
    public List<User> list(UserPageDto dto) {
        return null;
    }

    /**
     * 查询用户详情
     *
     * @param id id
     * @return Result<User>
     * @author Tomcat
     */
    @Operation(summary = "用户详情")
    @GetMapping(value = "{id}")
    public Result<User> getInfo(@PathVariable Integer id) {
        return null;
    }

    /**
     * 添加
     *
     * @param dto 用户信息
     * @return Result<Void>
     * @author Tomcat
     */
    @Operation(summary = "添加用户", groups = ValidaGroup.Create.class)
    @PostMapping
    public Result<Void> add(@RequestBody @Validated(ValidaGroup.Create.class) UserDto dto) {
        return null;
    }

    /**
     * 修改用户
     *
     * @param dto 用户信息
     * @return Result<Void>
     * @author Tomcat
     */
    @Operation(summary = "更改用户", groups = ValidaGroup.Update.class)
    @PutMapping
    public Result<Void> update(@RequestBody @Validated(ValidaGroup.Update.class) UserDto dto) {
        return null;
    }


    /**
     * 修改用户
     *
     * @param dto 用户信息
     * @return Result<Void>
     * @author Tomcat
     */
    @Operation(summary = "查询用户", groups = ValidaGroup.Query.class)
    @GetMapping("query")
    public Result<Void> query(@Validated(ValidaGroup.Query.class) UserDto dto) {
        return null;
    }

    /**
     * 删除用户
     *
     * @param dto 用户信息
     * @return Result<Void>
     * @author Tomcat
     */
    @Operation(summary = "删除用户", groups = ValidaGroup.Delete.class)
    @DeleteMapping("delete")
    public Result<Void> delete(@RequestBody @Validated(ValidaGroup.Delete.class) UserDto dto) {
        return null;
    }
}
