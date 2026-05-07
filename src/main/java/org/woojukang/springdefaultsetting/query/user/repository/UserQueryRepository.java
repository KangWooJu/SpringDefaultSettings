package org.woojukang.springdefaultsetting.query.user.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.woojukang.springdefaultsetting.domain.user.entity.QUser;
import org.woojukang.springdefaultsetting.domain.user.entity.User;


@Repository
@RequiredArgsConstructor
public class UserQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;
    private final QUser user = QUser.user;

    public User findByUsername(String username){

        return jpaQueryFactory
                .select(user)
                .from(user)
                .where(user
                        .username
                        .eq(username))
                .fetchOne();
    }

}
