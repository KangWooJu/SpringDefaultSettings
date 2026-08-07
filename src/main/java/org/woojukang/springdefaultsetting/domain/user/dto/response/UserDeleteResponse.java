package org.woojukang.springdefaultsetting.domain.user.dto.response;

import java.time.Instant;

public record UserDeleteResponse(String username,
                                 Instant deletedAt) {
}
