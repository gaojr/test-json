package cn.gjr.test.service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.annotation.Nonnull;

/**
 * Json-lib
 *
 * @author gaojr
 */
public class JsonLibUtils {

    public <B> String bean2String(B b) {
        try {
            return JSONObject.fromObject(b).toString();
        } catch (Exception ignored) {
        }
        try {
            return JSONArray.fromObject(b).toString();
        } catch (Exception ignored) {
        }
        return null;
    }

    public <B> Object string2Bean(String s, B bean) {
        JSONObject jsonObj = JSONObject.fromObject(s);
        return JSONObject.toBean(jsonObj, bean.getClass());
    }

    public static String pretty(String s) {
        // todo
        return null;
    }

    public static boolean isJson(String s) {
        // todo
        return false;
    }

    public static boolean has(@Nonnull JSONObject json, Object key) {
        return json.containsKey(key);
    }

    public static Object get(@Nonnull JSONObject json, Object key) {
        return json.get(key);
    }

    public static void remove(@Nonnull JSONObject json, Object key) {
        json.remove(key);
    }

    public static void add(@Nonnull JSONObject json, Object key, Object value) {
        json.put(key, value);
    }

}
