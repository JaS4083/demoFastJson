package com.example.demo.controller;

import com.example.demo.dto.SiteInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SiteInfoController {
    @PostMapping("/show")
    public String bid( @RequestBody SiteInfo  siteInfo ) {
        return siteInfo.toString();
    }
}
