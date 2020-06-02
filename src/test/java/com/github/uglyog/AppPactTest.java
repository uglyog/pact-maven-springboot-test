package com.github.uglyog;

import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junitsupport.Provider;
import au.com.dius.pact.provider.junitsupport.State;
import au.com.dius.pact.provider.junitsupport.loader.PactBroker;
import au.com.dius.pact.provider.junitsupport.loader.PactBrokerAuth;
import au.com.dius.pact.provider.junitsupport.target.Target;
import au.com.dius.pact.provider.junitsupport.target.TestTarget;
import au.com.dius.pact.provider.spring.SpringRestPactRunner;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRestPactRunner.class)
@Provider("ArticlesProviderDemo")
@PactBroker(authentication = @PactBrokerAuth(token = "${pactBrokerToken}"))
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AppPactTest
{
    @TestTarget
    @SuppressWarnings(value = "VisibilityModifier")
    public final Target target = new HttpTarget(8080);

    @State("Articles exist")
    public void articlesExist() {

    }

    @State("No articles exist")
    public void noArticlesExist() {

    }
}
