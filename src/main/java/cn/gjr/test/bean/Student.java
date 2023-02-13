package cn.gjr.test.bean;

import cn.gjr.test.constant.Sex;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author gaojr
 */
@NoArgsConstructor
@Data
public class Student {
    private String name;
    private Integer age;
    private Sex sex;
    private List<Grade> grades;
    private Boolean aliave;
}
