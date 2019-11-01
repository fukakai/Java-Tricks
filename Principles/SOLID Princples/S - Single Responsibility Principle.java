/**
* All looks good, until you would want to reuse the checkAccess code at some other place 
* OR you want to make changes to the way checkAccess is being done 
* OR you want to make change to the way email changes are being approved.
*/
public class UserSettingService{
  public void changeEmail(User user){
    if(checkAccess(user)){
       //Grant option to change
    }
  }
  public boolean checkAccess(User user){
    //Verify if the user is valid.
  }
}

/**
* #########################################################
* #################### Correct this #######################
* #########################################################
*/
public class UserSettingService{
  public void changeEmail(User user){
    if(SecurityService.checkAccess(user)){
       //Grant option to change
    }
  }
}
public class SecurityService{
  public static boolean checkAccess(User user){
    //check the access.
  }
}