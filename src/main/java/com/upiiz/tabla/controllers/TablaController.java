package com.upiiz.tabla.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TablaController{
    @GetMapping("/tabla")
    public String mostrartabla() {return "tabla";}
}