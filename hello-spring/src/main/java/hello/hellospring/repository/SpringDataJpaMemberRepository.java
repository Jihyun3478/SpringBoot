package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    // JPQL : select m from Member m where m.name = ? 쿼리를 자동으로 구현해줌
    // Optional<Member> findByName(String name, Long id); => select m from Member m where m.name = ? m.id = ?
    @Override
    Optional<Member> findByName(String name);
}
