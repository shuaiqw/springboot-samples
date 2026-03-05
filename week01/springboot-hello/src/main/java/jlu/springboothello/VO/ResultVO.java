package jlu.springboothello.VO;

import lombok.Data;

@Data
public class ResultVO<T> {
    private int code;
    private String msg;
    private T data;

    public ResultVO(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // 可选：添加静态成功方法，简化调用
    public static <T> ResultVO<T> success(T data) {
        return new ResultVO<>(200, "success", data);
    }
}
