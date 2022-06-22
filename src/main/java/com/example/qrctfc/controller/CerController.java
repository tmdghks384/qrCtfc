package com.example.qrctfc.controller;

import com.example.qrctfc.Service.CertificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Log4j2
public class CerController {

    @GetMapping("/")
    public String main() {
        return "user/home";
    }

    @GetMapping("/check")
    public String checkPage() {
        return "user/check";
    }

    @GetMapping("/checkIn")
    public String checkIn() {
        return "user/checkIn";
    }

    @GetMapping("/checkOut")
    public String checkOut() {
        return "user/checkOut";
    }

    @GetMapping("/deleteOut")
    public String check(){
        return "user/deleteOut";
    }


}
