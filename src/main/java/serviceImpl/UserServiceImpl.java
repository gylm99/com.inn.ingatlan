package serviceImpl;


import constents.IngatlanConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import service.UserService;
import utils.IngatlanUtils;

import java.util.Map;


@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        log.info("Insede signup{}",requestMap);
        if (validateSignUpMap(requestMap)){

        }else{
            return IngatlanUtils.getResponseEntity(IngatlanConstant.INVALID_DATA, HttpStatus.BAD_REQUEST);
        }
        return null;

    }

    private boolean validateSignUpMap(Map<String, String> requestMap){
      if (requestMap.containsKey("name") && requestMap.containsKey("contactNumber")
                && requestMap.containsKey("email") && requestMap.containsKey("password")){
          return  true;
      }
      return false;
    }
}
