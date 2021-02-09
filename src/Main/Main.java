
package Main;
import Users.*;

public class Main {

    public static void main(String[] args) {
       login_register_implemintation impmnt=new login_register_implemintation();
    
        if(impmnt.admin_is_exist())
        {
            admin_registration ar=new admin_registration();
            LoadingScreen.start(ar, 35);
        }
        else
        {
            user_login u=new user_login();
            LoadingScreen.start(u, 35);
        }
    }
    
}
