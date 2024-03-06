package com.mev.cloud.search.feign;


import com.mev.cloud.api.dto.EsPageDTO;
import com.mev.cloud.api.feign.SearchOrderFeignClient;
import com.mev.cloud.api.vo.EsPageVO;
import com.mev.cloud.api.vo.search.EsOrderVO;
import com.mev.cloud.common.dto.OrderSearchDTO;
import com.mev.cloud.common.response.ServerResponseEntity;
import com.mev.cloud.search.manager.OrderSearchManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品搜索feign连接
 * @author Alphaoumardev
 * @date 2020/12/07
 */
@RestController
public class SearchOrderFeignController implements SearchOrderFeignClient {

    @Autowired
    private OrderSearchManager orderSearchManager;


    @Override
    public ServerResponseEntity<EsPageVO<EsOrderVO>> getOrderPage(OrderSearchDTO orderSearch) {
        EsPageDTO pageDTO = new EsPageDTO();
        pageDTO.setPageNum(orderSearch.getPageNum());
        pageDTO.setPageSize(orderSearch.getPageSize());
        return ServerResponseEntity.success(orderSearchManager.pageSearchResult(pageDTO, orderSearch));
    }
}
