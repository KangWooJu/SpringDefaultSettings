package org.woojukang.springdefaultsetting.query.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.woojukang.springdefaultsetting.domain.user.entity.User;
import org.woojukang.springdefaultsetting.query.user.repository.UserQueryRepository;

@Service
@RequiredArgsConstructor
public class UserQueryService {

    private final UserQueryRepository userQueryRepository;

    public User findByUsername(String username){

        return userQueryRepository.findByUsername(username);

    }
}
