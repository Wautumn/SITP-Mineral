package com.example.demo.other;

import com.qiniu.api.auth.AuthException;
import com.qiniu.api.config.Config;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class MediaUploadUtils {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private String domain;
    String accessKey = "qzy__FY4LlKGnJ4Sj8oJmG0LZ33eoETNjgsUbD9d";
    String secretKey = "qzoBpIj4P4j5F76m8u5Bi9DtfYutHBw-7AQSrwdj";
    String bucketName = "mineralpic2";

    public static final String FLV = ".flv";

    public MediaUploadUtils() {

    }

    public boolean uploadFile(String localFile) throws AuthException,
            JSONException {
        File file = new File(localFile);
        return uploadFile(file);
    }

    public boolean uploadFile(File file) throws AuthException, JSONException {
        long startTime = System.currentTimeMillis();// 获取当前时间
        String uptoken = getUpToken();
        // 可选的上传选项，具体说明请参见使用手册。
        PutExtra extra = new PutExtra();
        // 上传文件
        PutRet ret = IoApi.putFile(uptoken, file.getName(),
                file.getAbsolutePath(), extra);
        if (ret.ok()) {
            logger.info("视频文件上传成功!");
            long endTime = System.currentTimeMillis();
            logger.info("视频文件上传用时：" + (endTime - startTime) + "ms");
            return true;
        } else {
            logger.error("视频文件上传失败!");
            return false;
        }
    }






}
