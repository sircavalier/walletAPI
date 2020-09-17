package com.wallet.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.wallet.entity.Wallet;
import com.wallet.entity.WalletItem;
import com.wallet.repository.WalletRepository;
import com.wallet.service.WalletService;

@Service
public class WalletServiceImpl implements WalletService {

	@Autowired
	private WalletRepository repository;
	
	@Override
	public Wallet save(Wallet w) {
		return repository.save(w);
	}

	@Override
	public Page<WalletItem> findBetweenDates(Long wallet, Date start, Date end, int page) {
		return null;
	}

}
