package hello.core.member;

public interface MemberService { // 역할(배역)
    void join(Member member);

    Member findMember(Long memberId);
}
