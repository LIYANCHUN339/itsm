package com.honor.itsm.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class SeverDemoController {
    @ResponseBody
    @RequestMapping("/notice")
    private String getJson(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("id","xxx1");
        jsonObject.put("title","Alipay");
        jsonObject.put("logo","https://gw.alipayobjects.com/zos/rmsportal/WdGqmHpayyMjiEhcKoVE.png");
        jsonObject.put("description","那是一种内在的东西，他们到达不了，也无法触及的");
        jsonObject.put("updatedAt","2018-11-20T01:00:58.147Z");
        jsonObject.put("member","科学搬砖组");
        jsonObject.put("href","");
        jsonObject.put("memberLink","");

        JSONObject jsonObject1=new JSONObject();
        jsonObject1.put("id","xxx2");
        jsonObject1.put("title","Alipay1");
        jsonObject1.put("logo","https://gw.alipayobjects.com/zos/rmsportal/WdGqmHpayyMjiEhcKoVE.png");
        jsonObject1.put("description","那是一种内在的东西，他们到达不了，也无法触及的");
        jsonObject1.put("updatedAt","2018-11-20T01:00:58.147Z");
        jsonObject1.put("member","科学搬砖组1");
        jsonObject1.put("href","");
        jsonObject1.put("memberLink","");

        JSONObject jsonObject2=new JSONObject();
        jsonObject2.put("id","xxx1");
        jsonObject2.put("title","Alipay");
        jsonObject2.put("logo","https://gw.alipayobjects.com/zos/rmsportal/WdGqmHpayyMjiEhcKoVE.png");
        jsonObject2.put("description","那是一种内在的东西，他们到达不了，也无法触及的");
        jsonObject2.put("updatedAt","2018-11-20T01:00:58.147Z");
        jsonObject2.put("member","科学搬砖组2");
        jsonObject2.put("href","");
        jsonObject2.put("memberLink","");

        JSONObject jsonObject3=new JSONObject();
        jsonObject3.put("id","xxx1");
        jsonObject3.put("title","Alipay");
        jsonObject3.put("logo","https://gw.alipayobjects.com/zos/rmsportal/WdGqmHpayyMjiEhcKoVE.png");
        jsonObject3.put("description","那是一种内在的东西，他们到达不了，也无法触及的");
        jsonObject3.put("updatedAt","2018-11-20T01:00:58.147Z");
        jsonObject3.put("member","科学搬砖组3");
        jsonObject3.put("href","");
        jsonObject3.put("memberLink","");

        JSONObject jsonObject4=new JSONObject();
        jsonObject4.put("id","xxx1");
        jsonObject4.put("title","Alipay");
        jsonObject4.put("logo","https://gw.alipayobjects.com/zos/rmsportal/WdGqmHpayyMjiEhcKoVE.png");
        jsonObject4.put("description","那是一种内在的东西，他们到达不了，也无法触及的");
        jsonObject4.put("updatedAt","2018-11-20T01:00:58.147Z");
        jsonObject4.put("member","科学搬砖组4");
        jsonObject4.put("href","");
        jsonObject4.put("memberLink","");

        JSONObject jsonObject5=new JSONObject();
        jsonObject5.put("id","xxx1");
        jsonObject5.put("title","Alipay");
        jsonObject5.put("logo","https://gw.alipayobjects.com/zos/rmsportal/WdGqmHpayyMjiEhcKoVE.png");
        jsonObject5.put("description","那是一种内在的东西，他们到达不了，也无法触及的");
        jsonObject5.put("updatedAt","2018-11-20T01:00:58.147Z");
        jsonObject5.put("member","科学搬砖组5");
        jsonObject5.put("href","");
        jsonObject5.put("memberLink","");
        JSONArray jsonArray=new JSONArray();
        jsonArray.add(jsonObject);
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        jsonArray.add(jsonObject3);
        jsonArray.add(jsonObject4);
        jsonArray.add(jsonObject5);
        return  jsonArray.toJSONString();
    }
}
