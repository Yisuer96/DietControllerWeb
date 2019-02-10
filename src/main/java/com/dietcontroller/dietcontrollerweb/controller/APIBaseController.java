package com.dietcontroller.dietcontrollerweb.controller;

import com.dietcontroller.dietcontrollerweb.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class APIBaseController {
    private static final String RESOURCE_NOT_FOUND = "没有找到资源";
    private static final String NOT_AUTHORIZED = "没有权限";
    private static final String WRONG_PARAM = "参数错误";

    private static final String USER_ID = "userId";

    public static final int PAGE_SIZE = 10;

    @Autowired
    protected HttpServletRequest request;

    public int getCurrentUserID() {
        Object o = request.getSession().getAttribute(USER_ID);
        if (o == null) {
            throw new ResourceNotFoundException();
        }
        return Integer.parseInt(o.toString());
    }
}