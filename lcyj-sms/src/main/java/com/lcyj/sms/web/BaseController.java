package com.lcyj.sms.web;

import com.lcyj.common.vo.ResultVo;
import org.springframework.web.bind.annotation.PathVariable;

public interface BaseController<T> {

     ResultVo add(T t);

     ResultVo update(T t);

     ResultVo getObject(@PathVariable Integer id);

     ResultVo delete(Integer id);

//     ResultVo listByPaging(@RequestBody SmsEmailVo smsEmailVo);
}
