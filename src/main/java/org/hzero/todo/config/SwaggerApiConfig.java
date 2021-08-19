package org.hzero.todo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Tag;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger Api 描述配置
 *
 * @author Timi 2021/08/13 16:02
 */

@Configuration
public class SwaggerApiConfig {
    public static final String USER = "User";
    public static final String TASK = "Task";

    @Autowired
    public SwaggerApiConfig(Docket docket) {
        docket.tags(
                new Tag(USER, "用户信息"),
                new Tag(TASK, "任务信息")
        );
    }
}
