package top.jlu.week04.exception;

import lombok.Getter;

/**
 * BusinessExcption
 *
 * @author 86195
 * @date 2026/3/27
 * @description TODO: 类描述
 */
@Getter
public class BusinessException extends RuntimeException {
    private final int code;
    public BusinessException(String msg) {
        super(msg);
        this.code = 500;
    }
    public BusinessException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}