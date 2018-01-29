package com.waioz.waioz.utils;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class jsonToString
{
    String text;
    public JSONObject jData;

    public jsonToString(String filePath)
    {
        try
        {
            Scanner scanner = new Scanner(new File(filePath));
            text = scanner.useDelimiter("\\A").next();
            scanner.close();
        }

        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

    }

    public void buildJSON()
    {
        try
        {
            jData = new JSONObject(text);
        }

        catch (JSONException e)
        {
            e.printStackTrace();
        }
    }



}
