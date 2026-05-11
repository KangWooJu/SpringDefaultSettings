package org.woojukang.springdefaultsetting.global.security.dto.response;

public record ReissueResponse(String message,
                              String time,
                              String accessToken,
                              String refreshToken) {
}
