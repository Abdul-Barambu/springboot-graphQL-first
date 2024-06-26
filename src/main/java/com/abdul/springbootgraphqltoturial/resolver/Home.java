package com.abdul.springbootgraphqltoturial.resolver;

import com.abdul.springbootgraphqltoturial.modal.UserRequest;
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
    public String bio(@Argument UserRequest userRequest) {
        return "My name is " + userRequest.getName() + " and i am " + userRequest.getAge() + " years old";
    }
}
