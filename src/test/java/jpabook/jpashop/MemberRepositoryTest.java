package jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest

public class MemberRepositoryTest {
    /*
    @Autowired MemberRepository memberRepository;


    테스트 시 @Transactional 은 기본적으로 rollback 으로 작동한다고 하셨는데
    일반적으로 db에서의 rollback 은 db에 쿼리가 나간 이후에 그 결과를 다시 원복하는 것으로 알 고 있습니다.
    그런데 이 경우에는 아예 db로 insert 쿼리 자체가 나가지 않은 것으로 보이는데
    그러면 최초 영속성 컨텍스트에만 저장하고, 종료 시점에는 db에 쿼리가 나가지 않고 끝나는게 맞나요?

    @Test
    @Transactional // Test에 있으면 테스트가 끝나고 데이터베이스를 rollback 해버림.
    @Rollback(false) //사용하면 rollback 안함.
    public void testMember() {
        //given
        Member member = new Member();
        member.setUsername("memberA");

        //when
        Long savedId = memberRepository.save(member);
        Member findMember = memberRepository.find(savedId);

        //then
        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
        Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
        Assertions.assertThat(findMember).isEqualTo(member);


        같은 트랜잭션 안에서 저장하고 조회하면 영속성 컨텍스트가 같다.  같은 영속성 컨텍스트 안에서는 아이디가 같으면 같은 엔티티로 식별, 영속성 컨텍스트 1차 캐쉬를 이용하여 비교
        원래는 해시코드랑 equals를 구현안했으니까 달라야하나?

      }
      */
}