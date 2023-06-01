package com.example.member.repository;

import com.example.member.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member memeber);

    Optional<Member> findById(int id);

    Optional<Member> findByName(String name);

    List<Member> findAll();

}
