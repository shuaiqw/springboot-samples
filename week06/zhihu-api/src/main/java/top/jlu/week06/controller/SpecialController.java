package top.jlu.week06.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import top.jlu.week06.common.Result;
import top.jlu.week06.entity.Special;
import top.jlu.week06.service.SpecialService;

/**
 * SpecialController 专题控制器
 *
 * @author 86195
 * @date 2026/4/9
 * @description 专题 REST API 接口，包含模糊查询和分页功能
 */
@RestController
@RequestMapping("/api/v1/special")
@Tag(name = "专栏接口", description = "专栏接口")
@RequiredArgsConstructor
public class SpecialController {
    private final SpecialService specialService;

    /**
     * 根据标题查询专栏
     *
     * @param title    标题
     * @param pageNum  页码
     * @param pageSize 页大小
     * @return 专栏列表
     */
    @GetMapping("/page")
    @Operation(summary = "分页查询专栏", description = "分页查询专栏接口")
    public Result<Page<Special>> selectByTitle(@RequestParam(required = false) String title, @RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "10") Integer pageSize) {
        return Result.success("查询成功", specialService.selectByTitle(title, pageNum, pageSize));
    }

     @GetMapping("/detail")
     @Operation(summary = "查询专栏详情", description = "查询专栏详情接口")
     public Result<Special> get(@RequestParam String id) {
        return Result.success("查询成功", specialService.selectById(id));
     }

}