package com.example.demo.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * id - Site ID on the exchange.
 * name - Site name. Usually in this attribute publisher’s domain will be passed.
 * domain - ? // need to check Open RTB spec.
 * keyWords - ? // need to check Open RTB spec.
 * page - Full url of the page where impression to be occur.
 * ref - ? // need to check Open RTB spec.
 * search - ? // need to check Open RTB spec.
 * publisher - Publisher Object.
 * ext - Optional site attributes, such as section ID and alternative categorization.
 * cat - Array of IAB content categories for the overall site.
 */

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