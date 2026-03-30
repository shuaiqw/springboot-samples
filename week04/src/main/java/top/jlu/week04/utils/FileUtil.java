package top.jlu.week04.utils;


import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.ResourceUtils;
import top.jlu.week04.exception.BusinessException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.UUID;

/**
 * @author 86195
 * @date 2026/3/26
 * @description 文件上传工具类
 */
public class FileUtil {
    private static final String UPLOAD_DIR = getUploadDir();

    static {
        File dir = new File(UPLOAD_DIR);
        if (!dir.exists()) {
            if (!dir.mkdirs()) {
                throw new RuntimeException("创建上传目录失败：" + UPLOAD_DIR);
            }
        }
    }

    /**
     * 允许上传的文件类型白名单
     */
    private static final Set<String> ALLOWED_EXTENSIONS = Set.of(
            // 图片
            "jpg", "jpeg", "png", "gif", "bmp", "webp",
            // 文档
            "pdf", "doc", "docx", "xls", "xlsx", "ppt", "pptx",
            // 文本
            "txt", "md", "csv",
            // 压缩包
            "zip", "rar", "7z",
            // 其他
            "json", "xml"
    );

    /**
     * 获取上传目录
     */
    private static String getUploadDir() {
        try {
            // 获取项目根目录
            String projectBaseDir = ResourceUtils.getURL("classpath:").getPath();
            if (projectBaseDir.startsWith("/")) {
                projectBaseDir = projectBaseDir.substring(1);
            }
            Path uploadPath = Path.of(projectBaseDir).resolve("static/upload");
            Files.createDirectories(uploadPath);
            String uploadDir = uploadPath.toAbsolutePath() + File.separator;
            return uploadDir;
        } catch (IOException e) {
            throw new RuntimeException("创建上传目录失败", e);
        }
    }

    /**
     * 上传文件
     *
     * @param file 上传文件
     * @return 文件名
     */
    public static String upload(MultipartFile file) throws IOException {
        // 获取文件名
        String originalFilename = file.getOriginalFilename();
        if (originalFilename == null || originalFilename.isBlank()) {
            throw new BusinessException(400, "文件名称为空");
        }

        // 获取后缀
        String suffix = originalFilename.substring(originalFilename.lastIndexOf(".")).toLowerCase();
        if (!ALLOWED_EXTENSIONS.contains(suffix.substring(1))) {
            throw new BusinessException(400, "不支持的文件类型：" + suffix);
        }

        // 生成文件名
        String filename = UUID.randomUUID() + suffix;
        File dest = new File(UPLOAD_DIR + filename);
        file.transferTo(dest);
        return filename;
    }
}