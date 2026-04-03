package top.jlu.week05.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import top.jlu.week05.entity.User;
import top.jlu.week05.mapper.UserMapper;

import java.time.LocalDateTime;
import java.util.List;

/**
 * UserService
 *
 * @author 86195
 * @date 2026/4/2
 * @description TODO: 类描述
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    /**
     * 插入用户
     * @param user 插入的记录
     * @return 影响行数
     */
    public int add(User user) {
        int result = userMapper.insert(user);
        user.setCreateTime(LocalDateTime.now());
        System.out.println(user);
        return result;
    }

    /**
     * 根据主键查询用户
     * @param id 主键
     * @return 用户
     */
    public User getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询所有用户
     * @return 用户列表
     */
    public List<User> list() {
        return userMapper.selectList();
    }

    /**
     * 根据主键更新用户
     * @param user 更新的记录
     * @return 影响行数
     */
    public int update(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    public int delete(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    public List<User> search(String username, Integer minAge) {
        return userMapper.selectByCondition(username, minAge);
    }

}
