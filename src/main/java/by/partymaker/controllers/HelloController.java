package by.partymaker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 14.07.2016.
 */
@RestController
@RequestMapping("/api/oauth")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String getFacebookAccessToken() {
        return "huii";
    }
}
