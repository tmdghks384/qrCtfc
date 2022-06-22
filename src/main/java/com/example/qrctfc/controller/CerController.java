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
        return "home";
    }

    @GetMapping("/check")
    public String checkPage() {
        return "check";
    }

    @GetMapping("/checkIn")
    public String checkIn() {
        return "checkIn";
    }

    @GetMapping("/checkOut")
    public String checkOut() {
        return "checkOut";
    }

    @GetMapping("/deleteOut")
    public String check(){
        return "deleteOut";
    }


}
