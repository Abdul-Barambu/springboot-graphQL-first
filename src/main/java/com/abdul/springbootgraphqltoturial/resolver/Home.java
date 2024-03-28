package com.abdul.springbootgraphqltoturial.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Component
@Controller
public class Home implements GraphQLQueryResolver {

    @QueryMapping
    public String works() {
        return "it works!!!";
    }

    @QueryMapping
    public String bio(@Argument String name, @Argument Integer age) {
        return "My name is " + name + " and i am " + age + " years old";
    }
}
