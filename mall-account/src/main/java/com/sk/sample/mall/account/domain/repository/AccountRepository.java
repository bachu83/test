package com.sk.sample.mall.account.domain.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sk.sample.mall.account.domain.model.Account;
import com.sk.sample.mall.account.domain.model.MemberType;
import com.sk.sample.mall.account.domain.model.MembershipLevelType;

@RepositoryRestResource
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {
	Account findByEmail(String email);
	Account findByNameLike(String name);
	List <Account> findByMemberType(@Param("memberType") MemberType memberType);
	List <Account> findByMembershipLevelType(@Param("membershipLevelType") MembershipLevelType membershipLevelType);
}
