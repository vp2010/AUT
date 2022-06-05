package api.pojo;

import lombok.Data;
// compex des JSON POJO
@Data
public class respEmpList {

    private String status;
    private Emp[] data;
    private String message;

//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public Emp[] getData() {
//        return data;
//    }
//
//    public void setData(Emp[] data) {
//        this.data = data;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }



}
