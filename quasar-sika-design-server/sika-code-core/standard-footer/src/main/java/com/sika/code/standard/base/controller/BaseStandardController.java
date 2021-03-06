package com.sika.code.standard.base.controller;

import com.sika.code.basic.controller.BaseController;
import com.sika.code.basic.errorcode.BaseErrorCode;
import com.sika.code.result.Result;
import com.sika.code.result.generator.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 标准框架基础控制类
 *
 * @author daiqi
 * @create 2018-11-29 20:22
 */
public class BaseStandardController extends BaseController {

    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected HttpServletResponse response;
    @Autowired
    protected HttpSession httpSession;
    @Autowired
    protected ResultGenerator resultGenerator;

    protected Result success(Object object) {
        return resultGenerator.generateResult(object);
    }

    protected Result fail(String message) {
        return resultGenerator.generateResultError(message);
    }

    protected Result fail(BaseErrorCode errorCode, String message) {
        return resultGenerator.generateResultError(errorCode, message);
    }

    protected ModelAndView view(String view) {
        return new ModelAndView(view);
    }

    protected ModelAndView view(String view, Map<String, Object> model) {
        return new ModelAndView(view, model);
    }

    protected ModelAndView redirect(String view) {
        return new ModelAndView("redirect:" + view);
    }

    protected ModelAndView forward(String view) {
        return new ModelAndView("forward:" + view);
    }
}
