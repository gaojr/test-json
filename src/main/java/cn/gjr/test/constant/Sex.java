package cn.gjr.test.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author gaojr
 */
@AllArgsConstructor
@Getter
public enum Sex {
    MALE(1, "男"),
    FEMALE(2, "女");

    private Integer type;
    private String describe;
}
