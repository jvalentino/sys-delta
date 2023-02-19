package com.github.jvalentino.delta.util

import groovy.transform.CompileDynamic

/**
 * Only purpose is to be able to easily mock dates.
 * @author john.valentino
 */
@CompileDynamic
@SuppressWarnings(['NoJavaUtilDate'])
class DateGenerator {

    static Date date() {
        new Date()
    }

}
