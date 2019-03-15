package com.example.demo.other;

import com.google.gson.Gson;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

public class FileUploadUtils {

    public static String fileUploadToQiNiu(String uploadFile, String fileName) {
        // 构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone2());
        UploadManager uploadManager = new UploadManager(cfg);

        String accessKey = "qzy__FY4LlKGnJ4Sj8oJmG0LZ33eoETNjgsUbD9d";
        String secretKey = "qzoBpIj4P4j5F76m8u5Bi9DtfYutHBw-7AQSrwdj";
        String bucket = "mineralpic2";


        String localFilePath =uploadFile;
        String key = fileName;

        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);

        try{
            System.out.println("a");
            Response response = uploadManager.put(localFilePath, key, upToken);
            System.out.println("a");
            // 解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(),
                    DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
        }catch(Exception ex){
            return "上传失败"+ex.getMessage();
        }
        return "上传成功";
    }

    }


