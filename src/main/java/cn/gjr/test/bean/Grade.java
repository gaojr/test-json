package cn.gjr.test.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gaojr
 */
@NoArgsConstructor
@Data
public class Grade {
    private String subject;
    private Integer score;
}
