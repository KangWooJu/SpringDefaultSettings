package org.woojukang.springdefaultsetting.global.config.exception.domain;

import org.woojukang.springdefaultsetting.global.config.exception.BaseExceptionEnum;

import java.io.Serial;

public class ForBiddenException extends BaseException{

    @Serial
    private static final long serialVersionUID = -5148452097821358350L;

    public ForBiddenException() {
        super(BaseExceptionEnum.FORBIDDEN, new Object[]{"인증 실패"});
    }

    public ForBiddenException(Object[] message) {
        super(BaseExceptionEnum.FORBIDDEN, message);
    }
}
