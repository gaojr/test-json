package cn.gjr.test.service;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.annotation.Nonnull;
import java.lang.reflect.Type;

/**
 * google/gson
 *
 * @author gaojr
 */
public class GsonUtils {

    private static GsonBuilder builder = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public static <B> String bean2String(B b) {
        return builder.create().toJson(b);
    }

    public static <B> B string2Bean(String s, Type type) {
        return builder.create().fromJson(s, type);
    }

    public static String pretty(String s) {
        JsonElement jsonElement = JsonParser.parseString(s);
        return builder.create().toJson(jsonElement);
    }

    public static boolean isJson(String s) {
        JsonElement element = JsonParser.parseString(s);
        return element.isJsonArray() || element.isJsonObject();
    }

    public static boolean has(@Nonnull JsonObject json, String key) {
        return json.has(key);
    }

    public static JsonElement get(@Nonnull JsonObject json, String key) {
        return json.get(key);
    }

    public static void remove(@Nonnull JsonObject json, String key) {
        json.remove(key);
    }

    public static void add(@Nonnull JsonObject json, String key, JsonElement value) {
        json.add(key, value);
    }

}
