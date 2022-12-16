package com.avaul.sqrequation.web;

import com.avaul.sqrequation.api.Api;
import com.avaul.sqrequation.dto.RadicalResponse;
import com.avaul.sqrequation.service.RadicalCalculationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ApiController implements Api {

    private final RadicalCalculationService service;

    public ApiController(RadicalCalculationService radicalCalculationService) {
        this.service = radicalCalculationService;
    }

    @Override
    public String redirect(Model model) {
        return null;
    }

    @Override
    public RadicalResponse getRadical(Double a, Double b, Double c) {
        RadicalResponse response = service.getRadical(a, b, c);
        return null;
    }
}
