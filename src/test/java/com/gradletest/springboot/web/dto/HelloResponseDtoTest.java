package com.gradletest.springboot.web.dto;

import com.gradletest.springboot.web.dto.HelloResponseDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HelloResponseDtoTest {

    @Test
    public void lombokTest(){

        String name ="test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo((name));
        //assertThat(dto.getAmount()).isEqualTo((amount));
    }
}
