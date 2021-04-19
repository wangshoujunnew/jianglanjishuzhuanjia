package com.daizhangbao.util;


import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;
import org.junit.Test;

import java.util.HashMap;

public class OCRUtilTestTestvalue {
    //        bankSlip();
    static String APP_ID = "23770965";
    static String API_KEY = "x2Wfgy3ndBnhG498zdHukps1";
    static String SECRET_KEY = "WCtixbpy9MVbGTjFckHKKlDffHpppTXS";
    // 初始化一个AipOcr
    static AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

    /**
     * 测试得到验证码上的文字, 和计算验真码的结果
     */
    @Test
    public void testYanzhenma() {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("recognize_granularity", "big");
        options.put("detect_direction", "true");
        options.put("vertexes_location", "true");
        options.put("probability", "true");


        // 参数为本地图片路径
        String image = "C:\\Users\\29812\\Desktop\\image.png";
        JSONObject res = client.accurateGeneral(image, options);
        System.out.println(res.toString(2));

        //        // 参数为本地图片二进制数组
        //        byte[] file = readImageFile(image);
        //        res = client.accurateGeneral(file, options);
        //        System.out.println(res.toString(2));
    }
}
