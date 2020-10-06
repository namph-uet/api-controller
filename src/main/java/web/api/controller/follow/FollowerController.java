package web.api.controller.follow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.api.service.GrpcClientFollowService;

@RestController
@RequestMapping("follower")
public class FollowerController {

    @Autowired
    private GrpcClientFollowService followService;

    @GetMapping
    @RequestMapping("/{userId}")
    public ResponseEntity getFollow(@PathVariable String userId) {
        return new ResponseEntity(followService.getAllFollower(userId, 1), HttpStatus.OK);
    }
    @PostMapping
    @RequestMapping("/add/{userId}")
    public ResponseEntity addFollower(@PathVariable String userId, @RequestBody String followerId ) {
        return new ResponseEntity(followService.addFollow(userId, followerId, true), HttpStatus.OK);
    }
}