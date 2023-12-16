package com.comix.app.repository.specs;

public class SpecsUtil {

    static String withSuffixAndPrefix(String value) { return withPrefix(withSuffix(value)); }

    static String withPrefix(String value) { return "%"+value; }
    static String withSuffix(String value) { return value+"%"; }
}
