package web.api.controller.user;

import com.google.gson.Gson;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import web.api.model.request.ChangeUsernameRequest;
import web.api.model.response.ResponseBase;
import web.api.model.response.Status;
import web.api.rpc.user.GetAllUserRequest;
import web.api.rpc.user.GetAllUserResponse;
import web.api.service.FileService;
import web.api.service.GrpcClientUserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final GrpcClientUserService grpcClientService;
    private final Gson gson;
    private final FileService fileService;

    public UserController(GrpcClientUserService grpcClientService, Gson gson, FileService fileService) {
        this.grpcClientService = grpcClientService;
        this.gson = gson;
        this.fileService = fileService;
    }

    @GetMapping()
    public ResponseEntity getUsers(@Param("page") int page) {
        GetAllUserRequest.Builder request = GetAllUserRequest.newBuilder();
        request.setPage(page);
        GetAllUserResponse response = null;
        try {
            response =  grpcClientService.getUsers(request.build());
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(gson.toJson(response), HttpStatus.OK);
    }

    @RequestMapping(value = "/{userId}/avatar", method = RequestMethod.POST)
    public ResponseEntity uploadUserAvatar(@RequestParam("file") MultipartFile file, @PathVariable String userId){
        return fileService.uploadAvatar(file,userId);
    }

    @RequestMapping(value = "/{userId}/username", method = RequestMethod.PUT)
    public ResponseEntity changeUsername(@PathVariable String userId, ChangeUsernameRequest request) {
        return grpcClientService.changeUserName(userId, request);
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public ResponseEntity getUserInfo(@PathVariable String userId) {
        return grpcClientService.getUserInfo(userId);
    }

    @RequestMapping(value = "/{userId}/avatar", method = RequestMethod.GET)
    public ResponseEntity getUserAvatar(@PathVariable String userId) {
        ResponseBase responseBase = new ResponseBase();
        String userAvatar = grpcClientService.getUserAvatar(userId);
        if(userAvatar == null) {
            responseBase.setStatus(Status.INTERNAL_SERVER);
            responseBase.setStatusCode(Status.StatusCode.SERVER_ERROR);
        }
        else {
            responseBase.setStatus(Status.SUCCESS);
            responseBase.setStatusCode(Status.StatusCode.NORMAL);
        }
        responseBase.setData(userAvatar);
        return new ResponseEntity(responseBase, HttpStatus.OK);
    }
}
