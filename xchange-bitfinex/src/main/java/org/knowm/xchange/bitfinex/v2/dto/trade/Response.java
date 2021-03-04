package org.knowm.xchange.bitfinex.v2.dto.trade;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** https://docs.bitfinex.com/reference#rest-auth-submit-order */
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@Setter
@Getter
@ToString
public class Response<T> {

  private Long mts;

  private String type;

  private String messageId;

  private String placeHolder1;

  private T object;

  private Integer code;

  private String status;

  private String text;
}
