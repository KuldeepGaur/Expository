package Login;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class LoginAction extends ActionSupport {


    private static final long serialVersionUID = -2613425890762568273L;

    @Override
    public String execute() throws Exception {

        HttpServletRequest request = ServletActionContext.getRequest();
        if(false){
            getLoginPage();
        } else {
            validateUser();
        }

        return "success";
    }

    public String getLoginPage(){
        return "loginPage";
    }

    public String validateUser(){
        return "validate";
    }

}
