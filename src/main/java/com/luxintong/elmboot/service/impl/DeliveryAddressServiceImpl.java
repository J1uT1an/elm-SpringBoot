package com.luxintong.elmboot.service.impl;

import com.luxintong.elmboot.mapper.DeliveryAddressMapper;
import com.luxintong.elmboot.po.DeliveryAddress;
import com.luxintong.elmboot.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @projectName: <h3>elmboot</h3>
 * @package: com.luxintong.elmboot.service.impl
 * @className: DeliveryAddressServiceImpl
 * @author: Lu Xintong
 * @description <p>DeliveryAddressServiceImpl</p>
 * @date: 2023-12-26 14:38
 * @version: 1.0
 */
@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {
	@Autowired
	private DeliveryAddressMapper deliveryAddressMapper;
	
	@Override
	public List<DeliveryAddress> listDeliveryAddressByUserId(String userId) {
		return deliveryAddressMapper.listDeliveryAddressByUserId(userId);
	}
	
	@Override
	public DeliveryAddress getDeliveryAddressById(Integer daId) {
		return deliveryAddressMapper.getDeliveryAddressById(daId);
	}
	
	@Override
	public int saveDeliveryAddress(DeliveryAddress deliveryAddress) {
		return deliveryAddressMapper.saveDeliveryAddress(deliveryAddress);
	}
	
	@Override
	public int updateDeliveryAddress(DeliveryAddress deliveryAddress) {
		return deliveryAddressMapper.updateDeliveryAddress(deliveryAddress);
	}
	
	@Override
	public int removeDeliveryAddress(Integer daId) {
		return deliveryAddressMapper.removeDeliveryAddress(daId);
	}
}
