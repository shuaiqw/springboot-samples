package top.jlu.week04.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.jlu.week04.Common.Result;
import top.jlu.week04.exception.BusinessException;
import top.jlu.week04.utils.FileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UPloadController
 *
 * @author 86195
 * @date 2026/3/27
 * @description TODO: 类描述
 */
@RestController
@RequestMapping("/api/file")
public class UPloadController {
    private static final String FILE_URL_PREFIX = "http://localhost:8080/upload/";
    /**
     * 单文件上传
     *
     * @param file 上传文件
     * @return 上传结果
     */
    @PostMapping("/upload")
    public Result<String> upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            throw new BusinessException(400, "文件不能为空");
        }
        String fileName;
        try {
            fileName = FileUtil.upload(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 拼接文件访问路径
        String url = FILE_URL_PREFIX + fileName;
        return Result.success(url);
    }
    /**
     * 多文件上传
     *
     * @param files 上传文件数组
     * @return 文件上传结果列表
     */
    @PostMapping("/upload/batch")
    public Result<List<String>> uploadBatch(@RequestParam("files") MultipartFile[] files) {
        if (files == null || files.length == 0) {
            throw new BusinessException(400, "文件不能为空");
        }
        List<String> urls = new ArrayList<>();
        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                continue;
            }
            try {
                String fileName = FileUtil.upload(file);
                urls.add(FILE_URL_PREFIX + fileName);
            } catch (IOException e) {
                throw new RuntimeException("文件上传失败: " + file.getOriginalFilename(), e);
            }
        }
        return Result.success(urls);
    }
}