package com.mev.cloud.biz.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Alphaoumardev
 * @date 2020/9/12
 */
@Setter
@Getter
public class OssVO {

    private String accessid;

    private String policy;

    private String signature;

    private String dir;

    private String host;

    private Integer expire;

    private String fileName;

    private String actionUrl;

    /**
     * url列表--minio中一条链接对应一个上传的文件
     * @return
     */
    private List<OssVO> ossList;

    @Override
    public String toString() {
        return "OssVO{" +
                "accessid='" + accessid + '\'' +
                ", policy='" + policy + '\'' +
                ", signature='" + signature + '\'' +
                ", dir='" + dir + '\'' +
                ", host='" + host + '\'' +
                ", expire='" + expire + '\'' +
                ", ossList='" + ossList + '\'' +
                '}';
    }
}
