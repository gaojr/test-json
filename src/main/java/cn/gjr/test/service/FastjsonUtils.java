package cn.gjr.test.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONValidator;
import com.alibaba.fastjson.TypeReference;

import javax.annotation.Nonnull;

/**
 * alibaba/fastjson
 *
 * @author gaojr
 */
public class FastjsonUtils {

    public <B> String bean2String(B b) {
        return JSON.toJSONString(b);
    }

    public <B> B string2Bean(String s, TypeReference<B> reference) {
        return JSON.parseObject(s, reference);
    }

    public static String pretty(String s) {
        return JSON.toJSONString(s, true);
    }

    public static boolean isJson(String s) {
        return JSONValidator.from(s).validate();
    }

    public static boolean has(@Nonnull JSONObject json, String key) {
        return json.containsKey(key);
    }

    public static Object get(@Nonnull JSONObject json, String key) {
        return json.get(key);
    }

    public static void remove(@Nonnull JSONObject json, String key) {
        json.remove(key);
    }

    public static void add(@Nonnull JSONObject json, String key, Object value) {
        json.put(key, value);
    }

}
