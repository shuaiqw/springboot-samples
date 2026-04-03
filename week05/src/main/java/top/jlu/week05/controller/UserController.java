package top.jlu.week05.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import top.jlu.week05.common.Result;
import top.jlu.week05.entity.User;
import top.jlu.week05.service.UserService;

import java.time.LocalDateTime;
import java.util.List;

/**
 * UserController
 *
 * @author 86195
 * @date 2026/4/2
 * @description TODO: 类描述
 */
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/demo")
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setUsername("1111");
        user.setPassword("123456");
        user.setAge(18);
        user.setEmail(" 16422802@qq.com ");
        user.setCreateTime(LocalDateTime.now());
        return user;
    }

    @PostMapping
    public Result<String> add(@RequestBody User user) {
        int row = userService.add(user);
        if(row !=1){
            return Result.error("添加失败");
        }
        return Result.success("添加成功");
    }

    @GetMapping("/{id}")
    public Result<User> get(@PathVariable Long id) {
        return Result.success(userService.getById(id));
    }

    @GetMapping("/list")
    public Result<List<User>> list() {
        return Result.success(userService.list());
    }

    @PutMapping("/{id}")
    public Result<String> update(@RequestBody User user) {
        int row = userService.update(user);
        if(row !=1){
            return Result.error("更新失败");
        }
        return Result.success("更新成功");
    }

    @DeleteMapping("/{id}")
    public Result<String> delete(@PathVariable Long id) {
        int row = userService.delete(id);
        if(row !=1){
            return Result.error("删除失败");
        }
        return Result.success("删除成功");
    }

    /**
     * 搜索功能
     *
     * @param username ⽤户名
     * @param minAge 最⼩年龄
     * @return 数据列表
     */
    @GetMapping("/search")
    public List<User> search(
            @RequestParam(required = false) String username,
            @RequestParam(required = false) Integer minAge) {
        return userService.search(username, minAge);
    }



}

