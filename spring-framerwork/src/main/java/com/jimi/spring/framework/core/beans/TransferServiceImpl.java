package com.jimi.spring.framework.core.beans;


/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/17 9:36
 */
public class TransferServiceImpl implements TransferService{

    private AccountRepository accountRepository;


    public TransferServiceImpl(AccountRepository accountRepository) {
        System.out.println("TransferServiceImpl-construct()");

        this.accountRepository = accountRepository;
    }

    public void init() {
        System.out.println("TransferServiceImpl-init");
// initialization logic
    }

    public void cleanup() {
// destruction logic
        System.out.println("TransferServiceImpl-cleanup");

    }
}
