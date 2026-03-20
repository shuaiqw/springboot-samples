package top.jlu.week03.common;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // 可选：添加静态成功方法，简化调用
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "success", data);
    }
}
