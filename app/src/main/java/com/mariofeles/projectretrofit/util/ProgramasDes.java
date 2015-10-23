package com.mariofeles.projectretrofit.util;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mariofeles.projectretrofit.model.Programas;

import java.lang.reflect.Type;

/**
 * Created by mario on 23/10/15.
 */
public class ProgramasDes implements JsonDeserializer<Object> {

    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement programas = json.getAsJsonObject();
        Log.i("mario", "JSONELEMNT: " + programas.toString());
        return (new Gson().fromJson(programas, Programas.class));
    }
}
