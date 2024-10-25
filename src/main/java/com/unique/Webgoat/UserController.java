package com.unique.Webgoat;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;
public class UserController {
    @GetMapping
public String getMessage()
{
    int x;
return "Hello World";
    }
}
