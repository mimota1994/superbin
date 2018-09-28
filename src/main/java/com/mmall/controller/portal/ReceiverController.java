package com.mmall.controller.portal;

import com.mmall.service.IDeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/receive/")
public class ReceiverController {

    private static Logger logger = LoggerFactory.getLogger(ReceiverController.class);

    @Autowired
    private IDeviceService iDeviceService;

    @RequestMapping(value = "receive.do")
    @ResponseBody
    public String getData(@RequestParam(value = "type") Integer type,
                        @RequestParam(value = "enc_data") String enc_data
                        ) {
        //type={0:"超声波",1:"异常”}

        iDeviceService.reveiveData(type, enc_data);

        return null;
    }

    @RequestMapping(value = "test.do")
    @ResponseBody
    public String getData(Integer id) {


        iDeviceService.test(id);

        return null;
    }

}
