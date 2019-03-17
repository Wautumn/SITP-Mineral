package com.example.demo.other;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.processing.OperationManager;
import com.qiniu.processing.OperationStatus;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.storage.persistent.FileRecorder;
import com.qiniu.util.Auth;

import java.io.IOException;
import java.nio.file.Paths;

public class MediaUploadUtils {
    public static void main(String[] args){
     /*   Configuration cfg = new Configuration(Zone.zone2());
        String accessKey = "qzy__FY4LlKGnJ4Sj8oJmG0LZ33eoETNjgsUbD9d";
        String secretKey = "qzoBpIj4P4j5F76m8u5Bi9DtfYutHBw-7AQSrwdj";
        String bucket = "media";

        String localFilePath = "C:\\Users\\22831\\Desktop\\SITP\\WeChat_20190315222216.mp4";

        String key = null;
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        String localTempDir = Paths.get(System.getenv("java.io.tmpdir"), bucket).toString();


        try {
            //设置断点续传文件进度保存目录
            FileRecorder fileRecorder = new FileRecorder(localTempDir);
            UploadManager uploadManager = new UploadManager(cfg, fileRecorder);
            try {
                Response response = uploadManager.put(localFilePath, key, upToken);
                //解析上传成功的结果
                DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                System.out.println(putRet.key);
                System.out.println(putRet.hash);
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/

        String accessKey = "qzy__FY4LlKGnJ4Sj8oJmG0LZ33eoETNjgsUbD9d";
        String secretKey = "qzoBpIj4P4j5F76m8u5Bi9DtfYutHBw-7AQSrwdj";
        String bucket = "media";

        String key="mmm1.mp4";
        Auth auth = Auth.create(accessKey, secretKey);
        String saveMp4Entry = String.format("%s:mm1.mp4", bucket);
        String persistentPipeline = "mps-pipe1";
//数据处理完成结果通知地址
        String persistentNotifyUrl = "http://api.example.com/qiniu/pfop/notify";

        Configuration cfg = new Configuration(Zone.zone0());
//...其他参数参考类注释
//构建持久化数据处理对象
        OperationManager operationManager=new OperationManager(auth,cfg);
        try {
            String persistentId = operationManager.pfop(bucket, key, saveMp4Entry, persistentPipeline, persistentNotifyUrl, true);
            //可以根据该 persistentId 查询任务处理进度
            System.out.println(persistentId);
            OperationStatus operationStatus = operationManager.prefop(persistentId);
            //解析 operationStatus 的结果
        } catch (QiniuException e) {
            System.err.println(e.response.toString());
        }
    }

    public static void fileUploadToQiNiu(String uploadFile, String fileName) {
        // 构造一个带指定Zone对象的配置类
      /*  Configuration cfg1 = new Configuration(Zone.zone2());
        UploadManager uploadManager = new UploadManager(cfg1);

        String accessKey = "qzy__FY4LlKGnJ4Sj8oJmG0LZ33eoETNjgsUbD9d";
        String secretKey = "qzoBpIj4P4j5F76m8u5Bi9DtfYutHBw-7AQSrwdj";
        String bucket = "media";


        String localFilePath = uploadFile;
        String key = fileName;

        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);

        String localTempDir = Paths.get(System.getenv("java.io.tmpdir"), bucket).toString();

        try {
            Response response = uploadManager.put(localFilePath, key, upToken);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
        } catch (QiniuException ex) {
            ex.getMessage();

        }*/
    }
}








