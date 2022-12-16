package com.avaul.sqrequation.api;


import com.avaul.sqrequation.dto.RadicalResponse;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface Api {

    @GetMapping(value = "/")
    @PostMapping(value = "/")
    String redirect(Model model);

    @GetMapping(value = ApiUris.GET_RADICAL)
    RadicalResponse getRadical(@PathVariable Double a, @PathVariable Double b, @PathVariable Double c);

}
