package org.woojukang.springdefaultsetting.global.constant.enums;

import tools.jackson.databind.annotation.JsonDeserialize;
import tools.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(

)
@JsonDeserialize(

)
public interface CodeCommInterface {
    String getCode();
    String getCodeName();
}
