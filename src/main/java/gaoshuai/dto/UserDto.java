package gaoshuai.dto;

/**
 * Created by gaoshuai on 2017/7/2.
 */
public class UserDto<T> {

    private static final long serialVersionUID = 305237403564441641L;

    private boolean success = Boolean.TRUE;

    private String errorCode = "";

    private String errorMSG = "";

    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMSG() {
        return errorMSG;
    }

    public void setErrorMSG(String errorMSG) {
        this.errorMSG = errorMSG;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
