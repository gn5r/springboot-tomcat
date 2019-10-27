package gn5r.gn5rapl.sample.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gn5r.gn5rapl.sample.Resource.SampleResource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "sample")
@EnableAutoConfiguration
@Api(tags = "サンプルコントローラー")
@CrossOrigin
public class SampleRestController {

	private Log log = LogFactory.getLog(SampleRestController.class);

	@ApiOperation(value = "サンプルメッセージの取得", notes = "GETリクエストに対してメッセージを返却します")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "正常に取得", response = SampleResource.class),
			@ApiResponse(code = 500, message = "サーバー内エラー")
	})
	@GetMapping(value = "get")
	public ResponseEntity<?> getHelloWorld() {

		SampleResource res = new SampleResource();
		res.setHello("こんにちは世界");
		log.info(res);

		return new ResponseEntity<SampleResource>(res, HttpStatus.OK);
	}
}
