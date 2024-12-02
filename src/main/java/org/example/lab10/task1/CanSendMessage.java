package org.example.lab10.task1;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CanSendMessage{
}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface RequiredPermission{
    String level();
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface UserPermission {
    String level();
}


