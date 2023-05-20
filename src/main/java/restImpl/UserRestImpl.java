package restImpl;

import constents.IngatlanConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import rest.UserRest;
import service.UserService;
import utils.IngatlanUtils;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<String> singUp(Map<String, String> requestMap) {
        try{
            return  userService.signUp(requestMap);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return IngatlanUtils.getResponseEntity(IngatlanConstant.SOMTHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
