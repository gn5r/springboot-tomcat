package gn5r.gn5rapl.sample.Resource;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@lombok.Data
@ApiModel(description = "サンプルリソース")
public class SampleResource {

	@ApiModelProperty(value = "ハロー", example = "Hello World", position = 1)
	String hello;
}
