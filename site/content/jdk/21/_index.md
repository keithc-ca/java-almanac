---
title: Java 21
---

{{< jdkdetails "21" >}}

This will be the next LTS Release after [Java 17](../17).

{{< /jdkdetails >}}

## Sandbox

Instantly compile and run Java 21 snippets without a local Java installation.

{{< sandbox version="java21" mainclass="Java21" preview="true" >}}
{{< sandboxsource "Java21.java" >}}
import java.lang.reflect.ClassFileFormatVersion;

public class Java21 {

    public static void main(String[] args) {
    	var v = ClassFileFormatVersion.latest();
        System.out.printf("Hello Java bytecode version %s!", v.major());
    }

}
{{< /sandboxsource >}}
{{< /sandbox >}}