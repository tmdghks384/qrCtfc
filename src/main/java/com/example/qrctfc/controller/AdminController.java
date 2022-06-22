package com.example.qrctfc.controller;

import com.example.qrctfc.Service.CertificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Log4j2
public class AdminController {
    private final CertificationService service;

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("member", service.list());
        return "list";
    }
}
