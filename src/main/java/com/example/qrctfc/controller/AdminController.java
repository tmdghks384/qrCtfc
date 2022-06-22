package com.example.qrctfc.controller;

import com.example.qrctfc.Service.AdminService;
import com.example.qrctfc.Service.CertificationService;
import com.example.qrctfc.VO.AdminVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@Log4j2
public class AdminController {
    private final CertificationService service;
    private final AdminService admin;

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("member", service.list());
        return "admin/list";
    }

    @GetMapping("/joinAdmin")
    public String join() {
        return "admin/joinAdmin";
    }

    @GetMapping("/login")
    public String login(){
        return "admin/loginAdmin";
    }

    @PostMapping("/loginAdmin")
    public String loginAdmin(AdminVO adminVO, HttpServletRequest request, RedirectAttributes redirectAttributes) {
        HttpSession session = request.getSession();
        AdminVO vo = admin.loginAdmin(adminVO);
        log.info(vo);
        if (vo == null) {
            session.setAttribute("member", null);
            redirectAttributes.addFlashAttribute("msg", false);
        } else {
            session.setAttribute("member", vo);
        }

        return "redirect:/admin";
    }
}
