package org.woojukang.springdefaultsetting.global.enums;

public interface MessageCommInterface {
    String getCode();
    String getMessage();

    default boolean isSuccess(){
        return this.getCode().equals(BaseEnums.Default.SUCCESS.getCode());
    }

    default boolean isFail(){
        return !this.getCode().equals(BaseEnums.Default.SUCCESS.getCode());
    }
}
