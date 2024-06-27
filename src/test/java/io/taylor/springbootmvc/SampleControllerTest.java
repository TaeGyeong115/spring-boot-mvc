package io.taylor.springbootmvc;


import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;



@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTest {
    @Autowired
    WebClient webClient;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void hello() throws Exception {
        // html 특화된 test 가능
        HtmlPage page = webClient.getPage("/hello");
        HtmlHeading1 h1 = page.getFirstByXPath("//h1");
        assertThat(h1.getTextContent()).isEqualToIgnoringCase("taylor");
    }

//    @Test
//    public void hello() throws Exception {
        // 요청 "/"
        // 응답
        // - 모델 name: taylor
        // - 뷰 이름: hello
//        mockMvc.perform(get("/hello"))
//                .andExpect(status().isOk())
//                .andDo(print())
//                .andExpect(view().name("hello"))
//                .andExpect(model().attribute("name", "taylor"))
//                .andExpect(content().string(CoreMatchers.containsString("taylor")));
//    }
}