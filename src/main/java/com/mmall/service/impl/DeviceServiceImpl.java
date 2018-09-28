package com.mmall.service.impl;

import com.mmall.dao.UltrasonicMapper;
import com.mmall.pojo.Ultrasonic;
import com.mmall.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service("iDeviceService")
public class DeviceServiceImpl implements IDeviceService {

	@Autowired
	private UltrasonicMapper ultrasonicMapper;

    @Override
    public void reveiveData(Integer type, String enc_data) {
        // TODO: 2018/9/7 解密
        ArrayList<String> data = decData(enc_data);
        //判断type类型
        if(type == 0){
            //超声波
            Ultrasonic ultrasonic = new Ultrasonic();
            ultrasonic.setRpiId(Integer.parseInt("0"));
            ultrasonic.setStatus(parseToInteger(data.get(1)));
            ultrasonic.setLoc(Integer.parseInt("0"));
        	ultrasonicMapper.insert(ultrasonic);
        }
    }

    @Override
    public void test(Integer id) {
        int a =0;
        ultrasonicMapper.selectByPrimaryKey(id);
        int b =0;
    }

    private Integer parseToInteger(String value){
        return 0;
    }
    private ArrayList<String> decData(String enc_data){
        // TODO: 2018/9/11 解密
    	ArrayList<String> arrayList = new ArrayList<>();
    	arrayList.add(enc_data);
    	arrayList.add(enc_data);
    	arrayList.add(enc_data);
    	return arrayList;
    }

 }
