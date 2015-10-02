package com.xelita.poc.dto

import scala.beans.BeanProperty

class ResponseDTO[T](successVal: Boolean, dataVal: T) {

  @BeanProperty
  var success: Boolean = successVal

  @BeanProperty
  var data: T = dataVal

  def this(data: T) = this(true, data)
}
