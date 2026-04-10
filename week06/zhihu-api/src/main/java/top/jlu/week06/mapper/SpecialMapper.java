package top.jlu.week06.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.jlu.week06.entity.Special;

/**
 * SpecialMapper 专题数据访问层
 *
 * @author 86195
 * @date 2026/4/9
 * @description 继承 BaseMapper 实现基础的 CRUD 操作
 */
@Mapper
public interface SpecialMapper extends BaseMapper<Special> {
}
