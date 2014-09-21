package com.cuubez.visualizer.annotation;

import java.lang.annotation.*;

@Documented
@Retention(value= RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE,ElementType.METHOD})
public @interface Group {

    String name();
    String tittle();

}
