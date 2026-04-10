package top.jlu.week06.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import top.jlu.week06.entity.Special;
import top.jlu.week06.mapper.SpecialMapper;

/**
 * SpecialService 专题服务层
 *
 * @author 86195
 * @date 2026/4/9
 * @description 专题业务逻辑处理，包含模糊查询和分页功能
 */
public interface SpecialService {

    /**
     * 根据标题获取专栏（分页）
     *
     * @param title    标题
     * @param pageNum  页码
     * @param pageSize 页大小
     * @return 专栏列表
     */
    Page<Special> selectByTitle(String title, int pageNum, int pageSize);

    /**
     *
     * @param id
     * @return
     */
    Special selectById(String id);
}
