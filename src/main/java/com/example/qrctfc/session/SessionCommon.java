package com.example.qrctfc.session;

import com.example.qrctfc.VO.AdminVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface SessionCommon {
    String MEMBERKEY = "member";

    public static AdminVO getMember(HttpServletRequest request) {
        HttpSession session = request.getSession();
        AdminVO vo = (AdminVO) session.getAttribute(MEMBERKEY);
        return vo;
    }
}
