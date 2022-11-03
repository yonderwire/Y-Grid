package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.demo.controller.StaffController;
import com.demo.model.PrimaryStaff;
import com.demo.model.Staff;

@RunWith(SpringRunner.class)
@WebMvcTest(StaffController.class)
public class StaffControllerTest {

    @Autowired
    MockMvc mvc;

    @Autowired
    WebApplicationContext webApplicationContext;

    @MockBean
    private StaffController staffController;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void shouldReturnAllStaff() throws Exception {
        String url = "/staff/list";
        PrimaryStaff ps = new PrimaryStaff(1, "Steve Spilberg", "Disney", "Clint", "Denzel");
        Staff staff_1 = new Staff(
                1,
                "spike less",
                ps);
        List<Staff> staffList = new ArrayList<>(
                Arrays.asList(
                        staff_1));

        when(staffController.getAllStaff()).thenReturn(staffList);
        MvcResult res = mvc.perform(MockMvcRequestBuilders.get(url)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = res.getResponse().getStatus();
        assertEquals(200, status);
        String content = res.getResponse().getContentAsString();
        Staff[] productlist = objectMapper.readValue(content, Staff[].class);
        assertTrue(productlist.length > 0);
    }

    @Test
    public void shouldCreateStaff() throws Exception {
        String url = "/staff/add";
        PrimaryStaff ps = new PrimaryStaff(1, "Steve Spilberg", "Disney", "Clint", "Denzel");
        Staff staff_1 = new Staff(
                1,
                "spike less",
                ps);
        List<Staff> staffList = new ArrayList<>(
                Arrays.asList(
                        staff_1));
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(url)
                .contentType(MediaType.APPLICATION_JSON_VALUE).content(objectMapper.writeValueAsString(staffList)))
                .andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }

    @Test
    public void shouldUpdateStaff() throws Exception {
        String url = "/staff/update";
        PrimaryStaff ps = new PrimaryStaff(1, "Steve Spilberg", "Disney", "Clint", "Denzel");
        Staff staff_1 = new Staff(
                1,
                "spike less",
                ps);
        List<Staff> staffList = new ArrayList<>(
                Arrays.asList(
                        staff_1));

        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(url)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(objectMapper.writeValueAsString(staffList))).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }

    @Test
    public void shouldDeleteStaff() throws Exception {
        String url = "/staff/delete/1";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(url)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }

}
