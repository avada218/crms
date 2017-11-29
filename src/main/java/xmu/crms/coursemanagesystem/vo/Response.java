package xmu.crms.coursemanagesystem.vo;

import java.util.List;

/**
 * @author badcode
 * @date 2017/11/29
 */
public class Response {

    private Integer code;
    private String message;
    private List<String> error;

    public Response(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Response(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getError() {
        return error;
    }

    public void setError(List<String> error) {
        this.error = error;
    }
}
