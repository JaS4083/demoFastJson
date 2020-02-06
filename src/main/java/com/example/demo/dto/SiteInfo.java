package com.example.demo.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SiteInfo {
    private String id;
    private String name;
    @JSONField(name = "domainname")
    private String domainName;
    private List<String> cat;
    @JSONField(name = "keywords")
    private String keyWords;
    private String page;
    private String search;
    @JSONField(name = "privacypolicy")
    private int privacyPolicy;

}