package com.mev.cloud.biz.controller.multishop;

import com.mev.cloud.biz.dto.AttachFileGroupDTO;
import com.mev.cloud.biz.model.AttachFileGroup;
import com.mev.cloud.biz.service.AttachFileGroupService;
import com.mev.cloud.biz.vo.AttachFileGroupVO;
import com.mev.cloud.common.response.ServerResponseEntity;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import com.mev.cloud.common.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

/**
 * 
 *
 * @author Alphaoumardev
 * @date 2020-12-04 16:15:02
 */
@RestController("multishopAttachFileGroupController")
@RequestMapping("/m/attach_file_group")
@Tag(name = "店铺-文件分组")
public class AttachFileGroupController {
    @Autowired
    private AttachFileGroupService attachFileGroupService;


	@GetMapping("/list")
	@Operation(summary = "获取列表" , description = "分页获取列表")
	public ServerResponseEntity<List<AttachFileGroupVO>> list() {
		List<AttachFileGroupVO> attachFileGroupPage = attachFileGroupService.list();
		return ServerResponseEntity.success(attachFileGroupPage);
	}

	@GetMapping
    @Operation(summary = "获取" , description = "根据attachFileGroupId获取")
    public ServerResponseEntity<AttachFileGroupVO> getByAttachFileGroupId(@RequestParam Long attachFileGroupId) {
        return ServerResponseEntity.success(attachFileGroupService.getByAttachFileGroupId(attachFileGroupId));
    }

    @PostMapping
    @Operation(summary = "保存" , description = "保存")
    public ServerResponseEntity<Void> save(@Valid @RequestBody AttachFileGroupDTO attachFileGroupDTO) {
        AttachFileGroup attachFileGroup = BeanUtil.map(attachFileGroupDTO, AttachFileGroup.class);
        attachFileGroup.setAttachFileGroupId(null);
        attachFileGroupService.save(attachFileGroup);
        return ServerResponseEntity.success();
    }

    @PutMapping
    @Operation(summary = "更新" , description = "更新")
    public ServerResponseEntity<Void> update(@Valid @RequestBody AttachFileGroupDTO attachFileGroupDTO) {
        AttachFileGroup attachFileGroup = BeanUtil.map(attachFileGroupDTO, AttachFileGroup.class);
        attachFileGroupService.update(attachFileGroup);
        return ServerResponseEntity.success();
    }

    @DeleteMapping
    @Operation(summary = "删除" , description = "根据id删除")
    public ServerResponseEntity<Void> delete(@RequestParam Long attachFileGroupId) {
        attachFileGroupService.deleteById(attachFileGroupId);
        return ServerResponseEntity.success();
    }
}
