package com.xelita.poc.controller

import com.xelita.poc.dto.ResponseDTO
import com.xelita.poc.service.ApplicationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RequestMapping(Array("/api"))
@RestController
class ApplicationController @Autowired()(service: ApplicationService) {

  @RequestMapping(Array("/check"))
  def check(): ResponseDTO[String] = {
    this.service.check()
  }
}
