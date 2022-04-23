package com.lab7.demo.Controller;

import com.lab7.demo.Models.Brand;
import com.lab7.demo.Models.Tablet;
import com.lab7.demo.Service.BrandService;
import com.lab7.demo.Service.TabletService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private final TabletService tabletService;
    private final BrandService brandService;

    public MainController(TabletService tabletService, BrandService brandService) {
        this.tabletService = tabletService;
        this.brandService = brandService;
    }

    @RequestMapping("/tablets")
    public String hello(Model model) {
        model.addAttribute("tabletAdd", new Tablet());
        model.addAttribute("tablets", tabletService.getAll());
        return "tablets";
    }

    @PostMapping("/addTablet")
    public String addTablets(@ModelAttribute Tablet tablet, Model model) {
        tabletService.add(tablet);
        return "redirect:/tablets";
    }

    @RequestMapping("/brands")
    public String add(Model model) {
        model.addAttribute("brandAdd", new Brand());
        model.addAttribute("brands", brandService.getAll());
        return "brands";
    }

    @PostMapping("/addBrand")
    public String addSubmit(@ModelAttribute Brand brand, Model model) {
        try {
            brandService.addOrReturn(brand);
        } catch (Exception e) {
            return "redirect:/brands";
        }

        return "redirect:/brands";
    }

    @GetMapping("/deleteBrand/{id}")
    public String deleteBrand(@PathVariable Integer id, Model model) {
        brandService.delete(id);
        return "redirect:/brands";
    }

    @GetMapping("/getTabletsByBrand/{id}")
    public String getTabletsByBrand(@PathVariable Integer id, Model model) {
        model.addAttribute("tabletAdd", new Tablet());
        model.addAttribute("tablets", tabletService.getByBrand(brandService.getById(id)));
        return "tablets";
    }

}
