package org.woojukang.springdefaultsetting.global.security.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.woojukang.springdefaultsetting.domain.user.entity.User;
import org.woojukang.springdefaultsetting.global.security.dto.UserAuthCache;
import org.woojukang.springdefaultsetting.query.user.service.UserQueryService;

@Service
@RequiredArgsConstructor
public class AuthPrincipalServiceImpl implements UserDetailsService {

    private final UserQueryService userQueryService;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        User user = userQueryService.findByUsername(username);

        UserAuthCache userAuthCache = new UserAuthCache(
                user
                        .getId(),
                user
                        .getUsername(),
                user
                        .getRole());

        return new AuthPrincipal(userAuthCache);
    }


}
