package web.api.controller.follow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.api.service.GrpcClientFollowService;

@RestController
@RequestMapping("follow")
public class FollowController {
    @Autowired
    private GrpcClientFollowService followService;

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public ResponseEntity getFollow(@PathVariable String userId) {
        return new ResponseEntity(followService.getAllFollower(userId, 0), HttpStatus.OK);
    }
}
