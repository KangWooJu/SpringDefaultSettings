package org.woojukang.springdefaultsetting.domain.user.entity;

import jakarta.persistence.*;
import lombok.*;
import org.woojukang.springdefaultsetting.global.converter.BooleanToYNConverter;
import org.woojukang.springdefaultsetting.global.jpa.BaseEntity;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false,unique = true)
    private String nickname;

    @Column(nullable = false)
    private String role;

    @Convert(converter = BooleanToYNConverter.class)
    @Column(nullable = false, length = 1)
    private boolean deleted;

    public void delete(){
        this.deleted = true;
        markDeleted();
    }

}
