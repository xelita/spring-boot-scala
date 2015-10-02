package com.xelita.poc.service

import com.xelita.poc.dto.ResponseDTO
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class ApplicationService {

  @Value("${check.message}")
  var message: String = _

  def check(): ResponseDTO[String] = {
    new ResponseDTO(this.message)
  }
}
