package top.jlu.week06.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Special 专题实体类
 *
 * @author 86195
 * @date 2026/4/9
 * @description 专题表 t_specails 对应的实体类
 */
@Data
@TableName("t_specails")
@Schema(description = "专题信息")
public class Special {

    @TableId
    @Schema(description = "主键ID")
    private String id;

    @Schema(description = "专题标题")
    private String title;

    @Schema(description = "专题介绍")
    private String introduction;

    @Schema(description = "封面图片URL")
    private String banner;

    @Schema(description = "浏览次数")
    private Integer viewCount;

    @Schema(description = "关注人数")
    private Integer followersCount;

    @Schema(description = "是否关注：0-否，1-是")
    private Integer isFollowing;

    @Schema(description = "包含新闻数量")
    private Integer sectionCount;

    @Schema(description = "是否更新：0-否，1-是")
    private Integer updated;
}
