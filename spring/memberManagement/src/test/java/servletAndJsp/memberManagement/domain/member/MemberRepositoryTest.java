package servletAndJsp.memberManagement.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.List;

class MemberRepositoryTest {


    // Get instance of MemberRepository to implement a test
    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach // Clear after each test is done
    void afterEach() {
        memberRepository.clearStore();
    }


    @Test
    void save() {
        // Given
        Member member = new Member("Chris", 20);

        // When
        Member savedMember = memberRepository.save(member);
        Member findMember = memberRepository.findById(savedMember.getId());

        // Then
        Assertions.assertThat(findMember).isEqualTo(savedMember);

    }


    @Test
    void findAllMembers() {
        // Given
        Member member1 = new Member("John", 32);
        Member member2 = new Member("Hana", 33);
        memberRepository.save(member1);
        memberRepository.save(member2);

        // When
        List<Member> savedMembers = memberRepository.findAllMembers();

        // Then
        Assertions.assertThat(savedMembers.size()).isEqualTo(2);
        Assertions.assertThat(savedMembers).contains(member1, member2);

    }

}
