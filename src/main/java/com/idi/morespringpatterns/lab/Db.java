package com.idi.morespringpatterns.lab;/**
 * @author Evgeny Borisov
 */

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Qualifier
public @interface Db {
    DBType value();
}
