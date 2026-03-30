package top.jlu.week04.handler;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.jlu.week04.Common.Result;
import top.jlu.week04.exception.BusinessException;

import java.util.StringJoiner;

/**
 * GlobalExceptionHandler
 *
 * @author 86195
 * @date 2026/3/27
 * @description TODO: 类描述
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理参数校验异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handleValidationException(MethodArgumentNotValidException e) {
        StringJoiner sj = new StringJoiner(";");
        for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
            sj.add(fieldError.getDefaultMessage());
        }
        return Result.error(400, sj.toString());
    }

    /**
     * 处理业务异常
     */
    @ExceptionHandler(BusinessException.class)
    public Result handleBusinessException(BusinessException e) {
        return Result.error(e.getCode(), e.getMessage());
    }

    /**
     * 处理其他异常
     */
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        return Result.error(500, "服务器异常，请稍后重试");
    }
}
