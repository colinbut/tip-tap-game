/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.tiptap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author colin
 */
@Controller
public class TapController {

    @RequestMapping(value = "/")
    public String tap() {
        return null;
    }
}
