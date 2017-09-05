package controllers;

import org.junit.Test;
import play.Application;
import play.filters.csrf.*;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.*;
import play.test.WithApplication;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.RequestBuilder;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.*;
import static play.api.test.CSRFTokenHelper.*;

public class UserControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void testUserGet() {
        RequestBuilder request = new RequestBuilder()
                .method(GET)
                .uri("/user");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    @Test
    public void testUserPost() {
        HashMap<String, String> formData = new HashMap<>();
        formData.put("name", "play");
        formData.put("age", "4");
        RequestBuilder request = addCSRFToken(new RequestBuilder()
                .header(Http.HeaderNames.HOST, "localhost")
                .method(POST)
                .bodyForm(formData)
                .uri("/user"));

        Result result = route(app, request);
        assertEquals(SEE_OTHER, result.status());
    }

}
