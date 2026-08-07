package org.woojukang.springdefaultsetting.domain.user.dto.response;

import java.time.Instant;

public record UserCreateResponse(String username,
                                 Instant createdAt,
                                 Instant updatedAt) {
}
