package com.gavin.epidemic.controller;

import com.gavin.epidemic.beans.*;
import com.gavin.epidemic.service.EpidemicService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/epidemicData")
public class EpidemicController {

    private Logger logger = Logger.getLogger(EpidemicController.class);

    @Autowired
    private EpidemicService epidemicService;

    @PostMapping("/ajax/input")
    //@RequestBody
    @ResponseBody
    public AjaxResponseInfo inputData(@RequestBody DailyEpidemicInfo dailyEpidemicInfo, Model model, HttpSession session) {
        logger.debug(dailyEpidemicInfo);

        AjaxResponseInfo responseInfo = new AjaxResponseInfo();
        //从Session中取得当前登录系统的用户的信息
        UserInfo user=(UserInfo)session.getAttribute("loginedUser");
        if(user==null){
            responseInfo.setCode(-2);
            responseInfo.setMsg("你还没有登录");
        }else {
            //将数据保存
            List<ProvinceInfo> list = this.epidemicService.saveData(dailyEpidemicInfo, user.getUserId());
            responseInfo.setData(list);
        }
        return responseInfo;
    }

    @GetMapping("/ajax/lastestData")
    @ResponseBody
    public AjaxResponseInfo findLastestData(){
        AjaxResponseInfo responseInfo=new AjaxResponseInfo();
        List<EpidemicDetailInfo> list=this.epidemicService.findLastestData();
        responseInfo.setData(list);
        return responseInfo;
    }
}
