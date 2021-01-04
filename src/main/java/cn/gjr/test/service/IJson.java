package cn.gjr.test.service;

/**
 * @author gaojr
 */
public interface IJson {

    <B> String bean2String(B b);

    <B> B string2Bean(String s, Class<B> clazz);

    <O> String object2String(O o);

    <O> O string2Object(String s);

    <B, O> O bean2Object(B b);

    <B, O> B object2Bean(O o, Class<B> clazz);

}
