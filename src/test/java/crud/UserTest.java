package crud;

import crud.Repository.UserRepository;
import crud.entity.ConsumerEntity;
import crud.entity.UserEntity;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by marqu on 20/02/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private UserRepository repo;

    @Before
    public void setup(){
        repo.deleteAll();
        repo.save(new ConsumerEntity(1L, "marcos", "markuela@gmail.com","123.456.789-00"));
        //repo.save(new UserEntity(1L,"Marcos", "marcos@marcos.com"/*, "123.456.789-00"*/));
        repo.save(new ConsumerEntity(2L,"Ione", "ione@ione.com", "009.876.543-21"));
    }


    @Test
    public void testGetUsers() throws Exception {
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/user").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("[{\"name\":\"marcos\",\"email\":\"markuela@gmail.com\",\"cpf\":\"123.456.789-00\"},{\"name\":\"Ione\",\"email\":\"ione@ione.com\",\"cpf\":\"009.876.543-21\"}]"))
                .andReturn();

        mvcResult.getResponse();
    }


    /*
    TODO: ver q porra é essa
     */
    @Ignore
    @Test
    public void testGetQR() throws Exception{
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/consumer/qr")
                                 .param("userId", "1"))
                                 .andExpect(status().isOk())
                                 .andExpect(content().string("1123.456.789-00"))
                                 .andReturn();
    }

//    @Test
//    public void testGetHelloWorld() throws Exception {
//        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().string(equalTo("hello world!")));
//    }

}
