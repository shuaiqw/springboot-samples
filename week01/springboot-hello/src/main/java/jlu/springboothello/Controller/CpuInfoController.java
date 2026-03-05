package jlu.springboothello.Controller;

import jlu.springboothello.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CPU核心数查询控制器
 * 基础路径：/api/system
 */
@RestController
@RequestMapping("/api/system")
public class CpuInfoController {

    /**
     * 查询CPU逻辑核心数
     * 接口路径：/cpu/cores
     * 请求方式：GET
     * @return 封装逻辑核心数的ResultVO
     */
    @GetMapping("/cpu/cores")
    public ResultVO<String> getCpuCores() {
        int logicalCores = Runtime.getRuntime().availableProcessors();
        String resultMsg = String.format("CPU逻辑核心数：%d", logicalCores);
        return ResultVO.success(resultMsg);
    }

    /**
     * 估算CPU物理核心数（基于超线程架构）
     * 接口路径：/cpu/physical-cores
     * 请求方式：GET
     * @return 封装物理核心数（估算值）的ResultVO
     */
    @GetMapping("/cpu/physical-cores")
    public ResultVO<String> getPhysicalCpuCores() {
        int logicalCores = Runtime.getRuntime().availableProcessors();
        // 超线程架构下物理核心数 = 逻辑核心数 / 2
        int physicalCores = logicalCores / 2;
        String resultMsg = String.format("CPU物理核心数（估算值）：%d，逻辑核心数：%d", physicalCores, logicalCores);
        return ResultVO.success(resultMsg);
    }
}
