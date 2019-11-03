package org.myyoung.cxzc.springbootcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class CacheController {
    @Autowired
    DemoService demoService;

    @RequestMapping("/put")
    public Person put(Person person) {
        return demoService.save(person);
    }

    @GetMapping("/able/{id}")
    public Person cacheable(@PathVariable("id") Long id) {
        return demoService.findOne(id);
    }

    @GetMapping("/evit/{id}")
    public String evit(@PathVariable("id") Long id) {
        demoService.remove(id);
        return "ok";
    }
}
