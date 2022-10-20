/**
 * 
 */
package kr.co.ensmart.frameworkdemo.app.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author choiyh44
 * @version 1.0
 * @since 2022. 4. 15.
 *
 */
@Getter
@Setter
@ToString
public class Sample {
    private String text1;
    private String text2;
    private String noXssText3;
}
