package com.mev.cloud.product.controller.app;

import com.mev.cloud.product.service.AttrService;
import com.mev.cloud.api.product.vo.AttrVO;
import com.mev.cloud.common.response.ServerResponseEntity;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 属性信息
 *
 * @author Alphaoumardev
 * @date 2020-10-28 15:27:23
 */
@RestController("appAttrController")
@RequestMapping("/ua/attr")
@Tag(name = "app-属性信息")
public class AttrController {

    @Autowired
    private AttrService attrService;



	@GetMapping
	@Operation(summary = "获取属性信息" , description = "根据attrId获取属性信息")
	public ServerResponseEntity<AttrVO> getByAttrId(@RequestParam Long attrId) {
		return ServerResponseEntity.success(attrService.getByAttrId(attrId));
	}
}
