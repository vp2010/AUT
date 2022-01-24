package api.pojo;

import lombok.Data;

@Data
public class respEmpList {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Emp[] getData() {
        return data;
    }

    public void setData(Emp[] data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private Emp[] data;
    private String message;

}
