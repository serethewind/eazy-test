package com.eazytest.eazytest.dto.general;

import com.eazytest.eazytest.dto.exam.ExamResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ReadResponseDto {

    private String message;
    private List<ExamResponseDto> examResponseDtoList;
}
