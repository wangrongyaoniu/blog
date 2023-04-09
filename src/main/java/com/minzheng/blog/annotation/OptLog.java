package com.minzheng.blog.annotation;

import org.springframework.data.elasticsearch.annotations.Document;

import java.lang.annotation.*;

/**
 * 操作日志注解
 *
 * @author yezhiqiu
 * @date 2021/07/28
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented  // @Document 是 java 在生成文档，是否显示注解的开关。
public @interface OptLog {

    /**
     * @return 操作类型
     */
    String optType() default "";

}
