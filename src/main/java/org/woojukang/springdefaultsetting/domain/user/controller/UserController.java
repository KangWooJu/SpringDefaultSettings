package org.woojukang.springdefaultsetting.domain.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.woojukang.springdefaultsetting.domain.user.dto.request.UserCreateRequest;
import org.woojukang.springdefaultsetting.domain.user.dto.response.UserCreateResponse;
import org.woojukang.springdefaultsetting.domain.user.dto.response.UserDeleteResponse;
import org.woojukang.springdefaultsetting.domain.user.facade.UserFacade;
import org.woojukang.springdefaultsetting.global.config.exception.dto.ApiResult;

@Tag(name = "user",description = "유저 API")
@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserFacade userFacade;

    @Operation(summary = "유저 생성",description = "유저를 생성합니다.")
    @PostMapping("/create")
    public ResponseEntity<ApiResult<UserCreateResponse>> create
            (@RequestBody UserCreateRequest userCreateRequest){

        return ResponseEntity
                .status(HttpStatus
                        .CREATED)
                .body(ApiResult
                        .success(userFacade
                                .create(userCreateRequest)));
    }

    @Operation(summary = "유저 삭제",description = "해당 유저를 삭제합니다.")
    @DeleteMapping("/delete")
    public ResponseEntity<ApiResult<UserDeleteResponse>> delete
            (@AuthenticationPrincipal UserDetails userDetails){

        return ResponseEntity
                .status(HttpStatus
                        .OK)
                .body(ApiResult
                        .success(userFacade
                                .delete(userDetails
                                        .getUsername())));

    }


}
