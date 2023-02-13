package cn.gjr.test;

import cn.gjr.test.bean.Grade;
import cn.gjr.test.bean.Student;
import cn.gjr.test.constant.Sex;
import cn.gjr.test.service.GsonUtils;
import com.google.common.collect.Lists;
import com.google.gson.reflect.TypeToken;

/**
 * TODO TestJson
 *
 * @author GaoJunru
 */
public class TestJson {
    public static void main(String[] args) {
        Grade grade = new Grade();
        grade.setScore(100);
        grade.setSubject("数学");
        Student student = new Student();
        student.setAge(18);
        student.setAliave(true);
        student.setSex(Sex.MALE);
        student.setName("学生");
        student.setGrades(Lists.newArrayList(grade));
        gson(grade, student);
        fastJson(grade, student);
    }

    private static void gson(final Grade grade, final Student student) {
        String nullStr = GsonUtils.bean2String(null); //
        String s = GsonUtils.bean2String(grade); // {"subject":"数学","score":100}
        Grade grade2 = GsonUtils.string2Bean(s, new TypeToken<Grade>() {
        }.getType());
        s = GsonUtils.bean2String(student); // {"name":"学生","age":18,"sex":"MALE","aliave":true}
        Student student2 = GsonUtils.string2Bean(s, new TypeToken<Student>() {
        }.getType());
        System.out.println(student);
    }

    private static void fastJson(final Grade grade, final Student student) {
    }
}
