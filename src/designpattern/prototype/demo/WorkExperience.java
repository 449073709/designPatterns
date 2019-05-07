package designpattern.prototype.demo;

import java.io.Serializable;

//工作经历类
public class WorkExperience implements Serializable {

    private String workDate;
    private String workCompany;

    //get、set
    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public void setWorkCompany(String workCompany) {
        this.workCompany = workCompany;
    }


}
