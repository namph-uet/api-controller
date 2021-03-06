package web.api.service;

import io.grpc.ManagedChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import web.api.model.request.ChangeUsernameRequest;
import web.api.model.request.PasswordForgotRequest;
import web.api.model.request.RegistrationRequest;
import web.api.model.response.*;
import web.api.model.user.UserPostList;
import web.api.rpc.user.*;
import web.api.rpc.user.GetUserInfoResponse;
import web.api.rpc.user.LoginResponse;
import web.api.rpc.user.NewPasswordResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class GrpcClientUserService {

    @Autowired
    @Qualifier("user-service")
    private ManagedChannel channel;
    @Autowired
    private  ConvertToGrpcRequest convert;

    private static String DEFAULT_AVATAR = "avatars/default-avatar.png";

    public LoginResponse login(web.api.model.request.LoginRequest loginRequest) throws Exception{
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        web.api.rpc.user.LoginRequest loginRequestGrpc = convert.convertToLoginRequestGprc(loginRequest);
        LoginResponse response = stub.login(loginRequestGrpc);
        return response;
    }

    public RegistrationResponse registerNewAccount(RegistrationRequest request){
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        RegistrationRequestGrpc requestGrpc = convert.convertToRegistrationRequestGrpc(request);
        RegistrationResponse response = new RegistrationResponse(stub.registration(requestGrpc));
        return response;
    }

    public PasswordForgotResponse forgotPassword(PasswordForgotRequest request){
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        PasswordResetRequest grpcRequest = convert.convertToPasswordResetRequest(request);
        PasswordForgotResponse response = new PasswordForgotResponse(stub.passwordForgot(grpcRequest));
        return response;
    }

    public VerificationEmailResponse verifyingEmail(String token){
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        ConfirmEmailRequest.Builder request = ConfirmEmailRequest.newBuilder();
        request.setToken(token);
        ConfirmEmailResponse response = stub.verificationTokenRegistration(request.build());
        return new VerificationEmailResponse(response);
    }

    public VerificationResetPasswordResponse verifyingResetPasswordToken(String token){
        VerificationResetPasswordTokenRequest request
                = convert.setVerificationPassTokenRequest(token);
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        VerificationResetPasswordTokenResponse grpcResponse = stub.verificationResetPasswordToken(request);
        VerificationResetPasswordResponse response = new VerificationResetPasswordResponse(grpcResponse);
        return response;
    }

    public web.api.model.response.NewPasswordResponse setNewPassword(
            web.api.model.request.NewPasswordRequest request,
            String token){
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        NewPasswordRequest grpcRequest = convert.convertToNewPasswordRequestGrpc(request,token);
        NewPasswordResponse grpcresponse = stub.passwordReset(grpcRequest);
        web.api.model.response.NewPasswordResponse response =
                new web.api.model.response.NewPasswordResponse(grpcresponse);
        return response;
    }

    public String registerInformation(web.api.model.request.RegistrationInformationRequest request){
        RegistrationInformationRequest grpcRequest = convert.convertToRegistrationInformationRequestGrpc(request);
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        RegistrationInformationResponse grpcResponse = stub.registrationInformation(grpcRequest);
        return grpcResponse.getStatus();
    }

    public String getEmailFromToken(GetEmailRequest request){
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        GetEmailResponse response = null;
        try {
            response = stub.getEmailFromToken(request);
        } catch (RuntimeException e){
        }
        return response.getEmail();
    }

    public boolean validateToken(ValidateTokenRequest request){
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        ValidateTokenResponse response = stub.validateToken(request);
        return response.getStatus();
    }

    public GetAllUserResponse getUsers(GetAllUserRequest request) {
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        GetAllUserResponse response = stub.getAllUser(request);
        return response;
    }

    public ResponseEntity changeUserName(String userId, ChangeUsernameRequest request) {
        ResponseBase responseBase = new ResponseBase();
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        ChangeUserNameRpcResponse response = null;
        ChangeUserNameRpcRequest.Builder rpcRequest = ChangeUserNameRpcRequest.newBuilder();
        rpcRequest.setUserId(userId);
        rpcRequest.setUsername(request.getUsername());

        try {
            response = stub.renameUser(rpcRequest.build());
        } catch (Exception e) {
            responseBase.setStatusCode(Status.StatusCode.SERVER_ERROR);
            responseBase.setStatus(Status.INTERNAL_SERVER);
        }

        if(response != null && response.getStatus().equals(Status.SUCCESS)) {
            responseBase.setStatusCode(Status.StatusCode.NORMAL);
            responseBase.setStatus(Status.SUCCESS);
        }
        else {
            responseBase.setStatusCode(Status.StatusCode.NODATA);
            responseBase.setStatus(Status.ERROR);
        }

        return new ResponseEntity(responseBase, HttpStatus.OK);
    }

    public SaveUserAvatarResponse SetUserAvatar(String path, String userId) throws Exception {
        SaveUserAvatarRequest.Builder request = SaveUserAvatarRequest.newBuilder();
        request.setImageSource(path);
        request.setUserId(userId);
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        SaveUserAvatarResponse response = stub.saveAvatar(request.build());
        return response;
    }

    public String getUserAvatar(String userId) {
        GetUserAvatarRequest.Builder request = GetUserAvatarRequest.newBuilder();
        request.setUserId(userId);
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        GetUserAvatarResponse response = null;

        try {
            response = stub.getUserAvatar(request.build());
        } catch (Exception e) {
            return null;
        }

        if(response != null) {
            return response.getAvatar().isEmpty() ? DEFAULT_AVATAR : response.getAvatar();
        }
        return null;
    }

    public ResponseEntity getUserInfo(String userId) {
        ResponseBase responseBase = new ResponseBase();
        web.api.model.response.GetUserInfoResponse getUserInfoResponse = new web.api.model.response.GetUserInfoResponse();
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        GetUserInfoResponse response = null;
        GetUserInfoRequest.Builder rpcRequest = GetUserInfoRequest.newBuilder();
        rpcRequest.setUserId(userId);
        try {
            response = stub.getUserInfo(rpcRequest.build());
        } catch (Exception e) {
            responseBase.setStatusCode(Status.StatusCode.SERVER_ERROR);
            responseBase.setStatus(Status.INTERNAL_SERVER);
        }

        if(response != null) {
            responseBase.setStatusCode(Status.StatusCode.NORMAL);
            responseBase.setStatus(Status.SUCCESS);
            responseBase.setData(response);
            getUserInfoResponse.setUserName(response.getUserName());
            getUserInfoResponse.setAvatar(response.getAvatar());
            getUserInfoResponse.setCity(response.getCity());
            getUserInfoResponse.setCountry(response.getCountry());
            getUserInfoResponse.setDescription(response.getDescription());

            List<String> followerList = new ArrayList<>();
            List<String> followingList = new ArrayList<>();
            List<UserPostList> postList = new ArrayList<>();

            followerList.addAll(response.getFollowersList());
            followingList.addAll(response.getFollowingList());

            response.getPotsList().forEach(e -> {
                UserPostList userPost = new UserPostList(e.getPotsId(), e.getImage());
                postList.add(userPost);
            });

            getUserInfoResponse.setFollowers(followerList);
            getUserInfoResponse.setFollowing(followingList);
            getUserInfoResponse.setPosts(postList);

            responseBase.setData(getUserInfoResponse);
        }
        else {
            responseBase.setStatusCode(Status.StatusCode.NODATA);
            responseBase.setStatus(Status.ERROR);
        }

        return new ResponseEntity(responseBase, HttpStatus.OK);
    }

}
