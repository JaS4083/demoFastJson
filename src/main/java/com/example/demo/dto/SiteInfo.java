package com.example.demo.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
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