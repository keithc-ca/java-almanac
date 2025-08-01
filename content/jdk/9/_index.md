---
title: Java 9
description: Information about Java 9 including documentation links, new APIs, added features and download options.
---

{{< jdkdetails "9" >}}

In quite an opinionated move Java got its own module system. While the original idea
was to modularize the enormous JDK API itself the *Java Platform Module System
(JPMS)* is now considered as the standard way to bundle any library.

The contents of Java 9 is specified in the umbrella [JSR 379](https://jcp.org/en/jsr/detail?id=379).

{{< /jdkdetails >}}


## Sandbox

Instantly compile and run Java 9 snippets without a local Java installation.

{{< sandbox version="java9" mainclass="Java9" >}}
{{< sandboxsource "Java9.java" >}}
public class Java9 {

    public static void main(String[] args) {

        System.out.println("Hello " + String.class.getModule());

    }

}
{{< /sandboxsource >}}
{{< /sandbox >}}
